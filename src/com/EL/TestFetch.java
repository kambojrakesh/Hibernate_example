package com.EL;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestFetch {
	
	public static void main(String obj[]){
		
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction(); 
        Employee employee=null;
        
        employee = (Employee) s.get(Employee.class, 1);
        System.out.println(employee.getFirstName()+" "+employee.getLastName());
        
       // s.close();
        t.commit();
         
	}
}
