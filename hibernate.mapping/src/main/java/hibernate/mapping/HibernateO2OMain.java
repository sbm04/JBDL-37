package hibernate.mapping;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateO2OMain {

	public static void main(String[] args) {
		// Create the SessionFactory from hibernate-annotation.cfg.xml
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate-one-to-one.cfg.xml");
    	System.out.println("Hibernate Annotation Configuration loaded");
    	
    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
    	System.out.println("Hibernate Annotation serviceRegistry created");
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	
    	Session session = sessionFactory.openSession();
    	
    	System.out.println("Session opened");
    	
    	Txn tx = new Txn();
    	tx.setAmount(1000);
    	tx.setDate(new Date());
    	
    	Customer c = new Customer();
    	c.setEmail("abc@abc.com");
    	c.setName("ABC");
    	c.setTxn(tx);
    	
    	tx.setCustomer(c);
    	
    	
    	Transaction t = session.beginTransaction();
    	
    	session.save(tx);
    	t.commit();
    	session.close();
    	
    	System.out.println("Transaction saves success.. "+tx.getId());
    	
	}
}
