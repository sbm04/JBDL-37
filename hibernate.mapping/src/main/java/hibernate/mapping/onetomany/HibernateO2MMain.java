package hibernate.mapping.onetomany;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateO2MMain {

	public static void main(String[] args) {
		// Create the SessionFactory from hibernate-annotation.cfg.xml
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate-one-to-many.cfg.xml");
    	System.out.println("Hibernate Annotation Configuration loaded");
    	
    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
    	System.out.println("Hibernate Annotation serviceRegistry created");
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	
    	Session session = sessionFactory.openSession();
    	
    	System.out.println("Session opened");
    	
    	Cart cart = new Cart();
    	cart.setCustomerName("Aditya's Cart");
    	
    	Items item = new Items(1, 123, 100, 1, cart);
    	Items item2 = new Items(2, 124, 34, 2, cart);

    	HashSet<Items> hs = new HashSet<Items>();
    	hs.add(item2);
    	hs.add(item);
    	
    	double total =0;
    	for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
			Items items = (Items) iterator.next();
			total = total+items.getQuantity()*items.getItemTotal();
		}
    	
    	cart.setTotal(total);
    	cart.setItems(hs);
    	
    	
    	Transaction t = session.beginTransaction();
    	
    	session.save(cart);
    	session.save(item);
    	session.save(item2);
    	
    	t.commit();
    	session.close();
    	
    	System.out.println("Transaction saves success.. ");
    	
	}
}
