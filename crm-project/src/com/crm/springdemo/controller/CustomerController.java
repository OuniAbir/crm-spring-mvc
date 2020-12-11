package com.crm.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.springdemo.dao.CustomerDAO;
import com.crm.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	//need to inject customer DAO 
	
	@Autowired
	private CustomerDAO customerDAO ;
	
	@RequestMapping("/list")
	public String listCustomer( Model theModel) {
		//get customers from dao
		List<Customer> theCustomers = customerDAO.getCustomer();
		
		//add the customers to the model
		theModel.addAttribute("customers", theCustomers);		
		return "list-customers";
	}
}
