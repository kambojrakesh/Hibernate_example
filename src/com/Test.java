package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
	
	public static void main(String obj[]){
		
         Session s = HibernateUtil.getSessionFactory().openSession();
         
         Transaction t = s.beginTransaction();
         
         Employee emp=new Employee();
         emp.setFirstName("rakesh");
         emp.setLastName("kumar");
         emp.setId(1);
         
         s.save(emp);

         t.commit();
         
	}
}
