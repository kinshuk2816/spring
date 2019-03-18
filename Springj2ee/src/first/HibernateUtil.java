package first;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static SessionFactory factory;
	
	public HibernateUtil() {
		
	}
	
	public void createSessionFactory() {
		
		factory =new Configuration().configure("hibernation.cfg.xml").buildSessionFactory();
		
	}

           public static SessionFactory getSessionFactory() {
	              return factory;
}


}

