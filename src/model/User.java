package model;
import java.time.LocalDate;
public class User{
	String name;
	String email;
	public String dob;
	String gender;
	public User(String name,String email,String dob,String gender){
		this.name=name;
		this.email=email;
		this.dob=dob;
		this.gender=gender;
	}
}