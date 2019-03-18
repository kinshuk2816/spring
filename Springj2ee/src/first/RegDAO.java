package first;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;






public class RegDAO {

	
public void addreg(String name,String password) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction tx1=session.beginTransaction();
		
		add rega=new add();
       
		rega.setName(name);
		
		rega.setPasssword(password);
		
		session.save(rega);
		tx1.commit();
		session.close();
		
		
	}
	

public void add(String name,String email,int mobile,String place) {
	
	SessionFactory factory=HibernateUtil.getSessionFactory();
	
	Session session=factory.openSession();
	
	Transaction tx1=session.beginTransaction();
	
	regadd rega2=new regadd();
   
	rega2.setName(name);
	
	rega2.setEmail(email);
	
	
	rega2.setMobile(mobile);
	
	rega2.setPlace(place);
	
	session.save(rega2);
	tx1.commit();
	session.close();
	
	
}





public List<add>  getUsers() {
	
			List<add>  users = new ArrayList<add> ();
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();
			
			users=session.createQuery("from add").list();
			session.close();
				
			return users;
			
		}






	
}
