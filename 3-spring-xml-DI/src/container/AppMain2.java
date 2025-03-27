package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;

public class AppMain2 {
public static void main(String[] args) {
	//core container
	//during loading time ApplicationContext will  create all objects
	ApplicationContext appContext=new ClassPathXmlApplicationContext("resources/spring.xml");
	Student	std=(Student)appContext.getBean("s");
	
	System.out.println(std.getName());
	System.out.println(std.getEmail());
	System.out.println(std.getPhone());
	
Student	std1=(Student)appContext.getBean("s1");
	
	System.out.println(std1.getName());
	System.out.println(std1.getEmail());
	System.out.println(std1.getPhone());
}
}
