import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.DatabaseClass.Employee;

public class Example1 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEno(1);
		e1.setEname("sudip");
		e1.setSal(20000f);
		e1.setDesignation("software engineer");
		
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e1);
		tx.commit();
		session.close();
		sf.close();
	
	}
}
