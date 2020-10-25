package pl.kalinowski.jakub.dao;

import pl.kalinowski.jakub.model.Customer;

public class CustomerDao extends AbstractDao<Customer>{
    public CustomerDao() {
        super(Customer.class);
    }
}
