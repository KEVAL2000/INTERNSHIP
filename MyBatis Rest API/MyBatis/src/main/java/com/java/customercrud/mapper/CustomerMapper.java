package com.java.customercrud.mapper;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.java.customercrud.model.Customer;
import com.java.customercrud.util.MyBatisUtil;

@Repository
public class CustomerMapper {

	private SqlSession session;

	public void saveCustomer(Customer customer) {
		try {
			session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.insert("insertCustomer", customer);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void updateCustomer(Customer customer) {
		try {
			session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.update("updateCustomer", customer);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deleteCustomerById(Long id) {
		try {
			session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.delete("deleteCustomerById", id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public List<Customer> viewCustomer() {
		List<Customer> customerList = null;
		try {
			session = MyBatisUtil.getSqlSessionFactory().openSession();
			customerList = session.selectList("viewCustomer");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return customerList;
	}

	public Customer findCustomerById(Long id) {
		Customer customer = null;
		try {
			session = MyBatisUtil.getSqlSessionFactory().openSession();
			customer = session.selectOne("findCustomerById", id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return customer;
	}

}