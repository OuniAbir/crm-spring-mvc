package com.crm.springdemo.service;

import java.util.List;

import com.crm.springdemo.entity.Customer;

public interface CustomerService {
public List<Customer> getCustomers();

public void saveCustomer(Customer customer);

public Customer getCustomers(int theId);

	
}
