package com.luv2code.SpringMVCHibernate.service;

import java.util.List;

import com.luv2code.SpringMVCHibernate.entity.Customer;

public interface CustomerService {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}
