package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Data {

	public static void main(String [] args) {
		Configuration cfg= new Configuration();
		cfg.configure("Employee.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t=session.beginTransaction();
		
		Test e1= new Test();
		 e1.setEmpNum(1998);
		 e1.setEmpName("tan");
		 e1.setEmpSalary(40000);
		 e1.setDeptNum(20);	   
		 
		 session.persist(e1);
		 t.commit();
		 session.close();
		 
		 System.out.println("SUCCESSFULLY SAVED");
		    	}
}
