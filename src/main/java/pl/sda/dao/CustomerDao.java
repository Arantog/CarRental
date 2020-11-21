package pl.sda.dao;

import pl.sda.model.Customer;

public class CustomerDao extends AbstractDao<Customer>{
    public CustomerDao() {
        super(Customer.class);
    }
}
