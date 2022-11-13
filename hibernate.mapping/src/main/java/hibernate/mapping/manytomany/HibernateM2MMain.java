package hibernate.mapping.manytomany;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateM2MMain {
	public static void main(String[] args) {
    	
    	Items item = new Items(1, 123, 100, 1);
    	Items item2 = new Items(2, 124, 34, 2);
		Cart cart = new Cart();
		cart.setTotal(500);
		Set<Items> items = new HashSet<Items>();
		items.add(item); items.add(item2);
		cart.setItems(items);
		
		SessionFactory sessionFactory = null;
		try{
		
        	Configuration configuration = new Configuration();
        	configuration.configure("hibernate-many-to-many.cfg.xml");
        	System.out.println("Hibernate Annotation Configuration loaded");
        	
        	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        	System.out.println("Hibernate Annotation serviceRegistry created");
        	
        	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
       
		
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(cart);
		System.out.println("Before committing transaction");
		tx.commit();
		sessionFactory.close();
		
		System.out.println("Cart ID="+cart.getId());
		System.out.println("Item1 ID="+item.getId());
		System.out.println("Item2 ID="+item2.getId());
		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(sessionFactory != null && !sessionFactory.isClosed()) sessionFactory.close();
		}
	}
	
//	public static void main(String[] args) {
//		// Create the SessionFactory from hibernate-annotation.cfg.xml
//    	Configuration configuration = new Configuration();
//    	configuration.configure("hibernate-many-to-many.cfg.xml");
//    	System.out.println("Hibernate Annotation Configuration loaded");
//    	
//    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//    	System.out.println("Hibernate Annotation serviceRegistry created");
//    	
//    	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//    	
//    	Session session = sessionFactory.openSession();
//    	
//    	System.out.println("Session opened");
//    	
//    	Cart cart = new Cart();
//    	cart.setCustomerName("Aditya's Cart");
//    	
//    	Items item = new Items(1, 123, 100, 1);
//    	Items item2 = new Items(2, 124, 34, 2);
//
//    	HashSet<Items> hs = new HashSet<Items>();
//    	hs.add(item2);
//    	hs.add(item);
//    	
//    	double total =0;
//    	for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
//			Items items = (Items) iterator.next();
//			total = total+items.getQuantity()*items.getItemTotal();
//		}
//    	
//    	cart.setTotal(total);
//    	cart.setItems(hs);
//    	
//    	
//    	Transaction t = session.beginTransaction();
//    	
//    	session.save(cart);
//    	
//    	
//    	t.commit();
//    	session.close();
//    	
//    	System.out.println("Transaction saves success.. ");
//    	
//	}
}
