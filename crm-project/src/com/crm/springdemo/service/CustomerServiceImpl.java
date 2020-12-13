package com.crm.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.springdemo.dao.CustomerDAO;
import com.crm.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject the session factory
	@Autowired
	private CustomerDAO customerDao;

	@Transactional
	public List<Customer> getCustomers() {
		// Delegate calls to DAO
		return customerDao.getCustomer();
	}

	@Transactional
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

	@Transactional
	public Customer getCustomers(int theId) {
		return customerDao.getCustomer(theId);
	}

	@Transactional
	public void deleteCustomer(int theId) {
		 customerDao.deleteCustomer(theId);
		
	}

}
