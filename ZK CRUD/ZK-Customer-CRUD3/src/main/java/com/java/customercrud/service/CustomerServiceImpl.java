package com.java.customercrud.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.customercrud.mapper.CustomerMapper;
import com.java.customercrud.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper = new CustomerMapper();

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
		customerData.setDateOfBirth(customer.getDateOfBirth());
		customerData.setMobileNumber(customer.getMobileNumber());
		customerData.setAddressOne(customer.getAddressOne());
		customerData.setAddressTwo(customer.getAddressTwo());
		customerData.setAge(customer.getAge());
		customerData.setGender(customer.getGender());
		customerData.setEmail(customer.getEmail());
		customerMapper.updateCustomer(customerData);
		System.out.println(customerData);
	}

	@Override
	public List<String> getGenderList() {
		List<String> genderList = new ArrayList<String>();
		genderList.add("Male");
		genderList.add("Female");
		genderList = Collections.unmodifiableList(genderList);
		return genderList;
	}
}