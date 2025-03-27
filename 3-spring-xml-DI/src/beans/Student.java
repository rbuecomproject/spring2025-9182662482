package beans;

public class Student {
	
	private String name;
	private String email;
	private long phone;
	
	public Student() {
	}
	
	public Student(String name, String email, long phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getPhone() {
		return phone;
	}
	
	
}
