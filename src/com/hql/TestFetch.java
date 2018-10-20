package com.hql;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestFetch {
	
	public static void main(String obj[]){
		
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction(); 
        
        /*Query query=s.createQuery("from employee_details"); 
        List list=query.list();  */
        
        List<Employee> result = (List<Employee>) s.createQuery("from EMPLOYEE").list();
        
        System.out.println(result.get(0).getFirstName());
       // s.close();
        t.commit();
         
	}
}
