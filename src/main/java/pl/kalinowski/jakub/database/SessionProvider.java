package pl.kalinowski.jakub.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionProvider {
    private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    public Session getSession(){
        return sessionFactory.openSession();
    }
}