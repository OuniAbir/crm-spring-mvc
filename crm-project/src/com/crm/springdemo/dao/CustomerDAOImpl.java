package com.crm.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.crm.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Customer> getCustomer() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create query
		Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);

		// excute the query
		List<Customer> customers = theQuery.getResultList();

		// return results
		return customers;
	}

}
