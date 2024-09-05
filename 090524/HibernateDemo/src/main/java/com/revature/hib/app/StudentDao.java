package com.revature.hib.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mysql.cj.xdevapi.SessionFactory;
import com.revature.hib.model.Student;

public class StudentDao {

		
	public void saveStudent(Student s) {
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			transaction=session.beginTransaction();
			session.save(s);
			transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
		}
	}	
	
	// update , delete 
	// persist , merge, remove
		
public List<Student> getAllStudents(){
			List<Student> stuList;
			try(Session session=HibernateUtil.getSessionFactory().openSession()){
				stuList=session.createQuery("from Student",Student.class).list();
			}
			return stuList;
		}
}

