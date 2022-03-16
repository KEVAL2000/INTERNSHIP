package com.java.customercrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.customercrud.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	public Customer findByEmail(String email);

	public Customer findByMobileNumber(String mobileNumber);

}