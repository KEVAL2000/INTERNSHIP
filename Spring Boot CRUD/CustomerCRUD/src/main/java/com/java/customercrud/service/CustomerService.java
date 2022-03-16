package com.java.customercrud.service;

import java.util.List;
import com.java.customercrud.model.Customer;

public interface CustomerService {

	public List<Customer> viewCustomer();

	public Customer saveAndUpdateCustomer(Customer customer);

	public boolean checkEmail(Long id, String email);

	public boolean checkMobileNumber(Long id, String mobileNumber);

	public Customer getCustomerById(Long id);

	public void deleteCustomerById(Long id);

}