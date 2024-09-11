package com.revature.hib.app;

import java.util.List;

import com.revature.hib.model.Student;

public class MyApp {
public static void main(String[] args) {
	StudentDao studentDao=new StudentDao();
	/*
	 * Student student=new Student( "Shrey", "B", "shrey@abc.com");
	 * studentDao.saveStudent(student);
	 */
	
	List<Student> sList=studentDao.getAllStudents();
	/*
	 * for(Student s:sList) System.out.println(s.getId() +"   "+s.getFirstName());
	 */
	sList.forEach(System.out::println);
	
	System.out.println(studentDao.getStudentById(2));
}
}
