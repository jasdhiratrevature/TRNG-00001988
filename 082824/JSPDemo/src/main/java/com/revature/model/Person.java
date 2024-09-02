package com.revature.model;

public class Person {
private String userName;
private String email;
public Person() {
	super();
}
public Person(String userName, String email) {
	super();
	this.userName = userName;
	this.email = email;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
@Override
public String toString() {
	return "Person [userName=" + userName + ", email=" + email + "]";
}
public void setEmail(String email) {
	this.email = email;
}

}
