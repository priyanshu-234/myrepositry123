package myfirsthibernat.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity 
public class student1 {
	@Id 
	@GeneratedValue(strategy  =GenerationType.IDENTITY)
	@Column(name  = "student1_id")
	private  int  id  ;
	@Transient 
	@Column(name  =  "Student2_age")
	
	private  int  age  ;
	@Column(name  = "Student3_phone")
	private  int  phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public student1(int age, int phone) {
		super();
		
		this.age = age;
		this.phone = phone;
	}
	
	public student1() {
		super();
	}
	@Override
	public String toString() {
		return "student1 [id=" + id + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
	
	 

}
