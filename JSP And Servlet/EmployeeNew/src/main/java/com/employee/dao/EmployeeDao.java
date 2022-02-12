package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.employee.model.Employee;
import com.employee.util.DatabaseConnection;

public class EmployeeDao {

	public String add(Employee employee) {
		Connection connection = DatabaseConnection.createConnection();
		String INSERT_QUERY_NEW = "insert into employee(first_name, last_name, user_name, password, address, mobile_number) values(?, ?, ?, ?, ?, ?);";
		String result = "data is entered successfully";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY_NEW);
			preparedStatement.setString(1, employee.getFirstName());
			preparedStatement.setString(2, employee.getLastName());
			preparedStatement.setString(3, employee.getUserName());
			preparedStatement.setString(4, employee.getPassword());
			preparedStatement.setString(5, employee.getAddress());
			preparedStatement.setString(6, employee.getMobileNumber());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			result = "data is not entered successfully";
		}
		return result;
	}

}