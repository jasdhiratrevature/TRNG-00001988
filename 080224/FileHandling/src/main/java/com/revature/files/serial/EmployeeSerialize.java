package com.revature.files.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerialize {
public static void main(String[] args) {
	
	
	FileOutputStream fos=null;
	ObjectOutputStream oos;
	
	Employee emp=null;
	// Write Employee Object to a file
	try {
		fos=new FileOutputStream("C:\\filehandling\\employee.dat");
		oos=new ObjectOutputStream(fos);
		emp=new Employee(101, "Jasdhir", "Trainer");
		oos.writeObject(emp);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// Read Employee Object to a file
	
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	Employee fromFileEmployee=null;
	try {
		fis=new FileInputStream("C:\\filehandling\\employee.dat");
		ois=new ObjectInputStream(fis);
		fromFileEmployee=(Employee) ois.readObject();
		System.out.println(fromFileEmployee);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
