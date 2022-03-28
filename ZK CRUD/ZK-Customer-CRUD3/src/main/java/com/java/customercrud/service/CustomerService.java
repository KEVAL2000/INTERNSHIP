package com.java.customercrud.service;

import java.util.List;
import com.java.customercrud.model.Customer;

public interface CustomerService {

	public List<Customer> viewCustomer();

	public void saveCustomer(Customer customer);

	public void updateCustomer(Customer customer);

	public Customer getCustomerById(Long id);

	public void deleteCustomerById(Long id);

	public List<String> getGenderList();

}