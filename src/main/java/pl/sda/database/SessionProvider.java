package pl.sda.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionProvider {
    final static private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    public static Session getSession(){
        return sessionFactory.openSession();
    }
}