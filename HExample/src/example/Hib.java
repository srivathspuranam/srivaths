package example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hib {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
        H e = new H();
       
    	 e.setEmpName("xyz");
    	  e.setEmpSalary(100);
    	  
    	  session.persist(e);
     	  t.commit();
     	  session.close();
	System.out.println("saved");	
		
	}
}
