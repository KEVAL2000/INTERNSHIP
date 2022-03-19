package com.java.customercrud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.customercrud.mapper.CustomerMapper;
import com.java.customercrud.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public List<Customer> viewCustomer() {
		return customerMapper.viewCustomer();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerMapper.saveCustomer(customer);
	}

	@Override
	public Customer getCustomerById(Long id) {
		return customerMapper.findCustomerById(id);
	}

	@Override
	public void deleteCustomerById(Long id) {
		customerMapper.deleteCustomerById(id);
	}

	@Override
	public void updateCustomer(Customer customer) {
		Customer customerData = getCustomerById(customer.getId());
		customerData.setFirstName(customer.getFirstName());
		customerData.setLastName(customer.getLastName());
		customerData.setAge(customer.getAge());
		customerData.setMobileNumber(customer.getMobileNumber());
		customerData.setEmail(customer.getEmail());
		customerMapper.updateCustomer(customerData);
		System.out.println(customerData);
	}

}