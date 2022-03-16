package com.java.customercrud.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.java.customercrud.exception.CustomerNotFoundException;
import com.java.customercrud.model.Customer;
import com.java.customercrud.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> viewCustomer() {
		return customerRepository.findAll(Sort.by("id").descending());
	}

	@Override
	public Customer saveAndUpdateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public boolean checkEmail(Long id, String email) {
		boolean uniqueEmail = false;
		Customer findEmail = customerRepository.findByEmail(email);
		boolean isCreate = (id == null || id == 0);
		if (isCreate) {
			if (findEmail != null)
				uniqueEmail = true;
		} else {
			if (findEmail != null && findEmail.getId() != id) {
				uniqueEmail = true;
			}
		}
		return uniqueEmail;
	}

	@Override
	public boolean checkMobileNumber(Long id, String mobileNumber) {
		boolean uniqueMobileNumber = false;
		Customer findMobileNumber = customerRepository.findByMobileNumber(mobileNumber);
		boolean isCreate = (id == null || id == 0);
		if (isCreate) {
			if (findMobileNumber != null)
				uniqueMobileNumber = true;
		} else {
			if (findMobileNumber != null && findMobileNumber.getId() != id) {
				uniqueMobileNumber = true;
			}
		}
		return uniqueMobileNumber;
	}

	@Override
	public Customer getCustomerById(Long id) {
		Optional<Customer> optional = customerRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new CustomerNotFoundException("Customer with ID : " + id + " Not Found");
		}
	}

	@Override
	public void deleteCustomerById(Long id) {
		customerRepository.delete(getCustomerById(id));
	}

}