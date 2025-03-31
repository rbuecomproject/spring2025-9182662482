package com.rbu.dao;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rbu.rest.User;

@Repository
public class UserDao {
	
	@Autowired
	DataSource dataSource;
	
	
	public void save(User user) {
		try {
			Connection con=dataSource.getConnection();
			Statement statement=con.createStatement();
			int i=statement.executeUpdate("insert into user(name,email,address,phone) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getAddress()+"','"+user.getPhone()+"')");
			if(i>0) {
				System.out.println("success");
			}
			else
			{
				System.out.println("failed");
			}
			statement.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
