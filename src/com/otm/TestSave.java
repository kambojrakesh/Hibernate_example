package com.otm;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestSave {
	
	public static void main(String obj[]){
		
         Session s = HibernateUtil.getSessionFactory().openSession();
         
         Transaction t = s.beginTransaction();
         
         Employee emp=new Employee();
         emp.setFirstName("rakesh");
         emp.setLastName("kumar");
         
         Address a=new Address();
         a.setCity("fb");
         a.setState("HR");
         a.setCountry("IN");
         a.setEmployee(emp);
         
         
         Address a1=new Address();
         a1.setCity("tr");
         a1.setState("on");
         a1.setCountry("CA");
         a1.setEmployee(emp);
         
         List ss=new ArrayList();
         ss.add(a);
         ss.add(a1);
         emp.setAddress(ss);
         
         s.save(emp);
         s.save(a);
         s.save(a1);
         t.commit();
         
	}
}
