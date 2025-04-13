package myfirsthibernat.hibernate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity 
@Table(name  = "student123")
public class student {
@Id
@GeneratedValue(strategy=  GenerationType.AUTO) 
private  int id;
private  String  name  ;
private String  sirname  ;
private  String  city  ;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSirname() {
	return sirname;
}
public void setSirname(String sirname) {
	this.sirname = sirname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public student(int id, String name, String sirname, String city) {
	super();
	this.id = id;
	this.name = name;
	this.sirname = sirname;
	this.city = city;
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", sirname=" + sirname + ", city=" + city + "]";
}
public student() {
	super();
}


	
	

}
