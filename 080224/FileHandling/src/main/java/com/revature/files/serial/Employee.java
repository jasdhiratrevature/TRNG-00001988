package com.revature.files.serial;

import java.io.Serializable;

public class Employee implements Serializable{

	private int id;
	private String name;
	private transient String jobTitle;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String jobTitle) {
		super();
		this.id = id;
		this.name = name;
		this.jobTitle = jobTitle;
	}
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
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", jobTitle=" + jobTitle + "]";
	}
	
	
}
