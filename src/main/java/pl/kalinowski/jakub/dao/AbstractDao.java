package pl.kalinowski.jakub.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.kalinowski.jakub.database.SessionProvider;

public abstract class AbstractDao<T> {
    private Class<T> clazz;

    public AbstractDao(Class<T> clazz) {
        this.clazz = clazz;
    }

    public void add(T record) {
        Session session = SessionProvider.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(record);
        transaction.commit();
        session.close();
    }
    public T findById(int id){
        Session session = SessionProvider.getSession();
        final T record = session.find(clazz, id);
        session.close();
        return record;
    }
}
