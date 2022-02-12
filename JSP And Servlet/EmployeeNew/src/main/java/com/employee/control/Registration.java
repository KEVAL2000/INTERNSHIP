package com.employee.control;

import com.employee.dao.EmployeeDao;
import com.employee.model.Employee;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String mobileNumber = request.getParameter("mobileNumber");

		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setUserName(userName);
		employee.setPassword(password);
		employee.setAddress(address);
		employee.setMobileNumber(mobileNumber);

		EmployeeDao employeeDao = new EmployeeDao();
		String result = employeeDao.add(employee);
		request.setAttribute("success", result);
		request.setAttribute("firstName", employee.getFirstName());
		request.setAttribute("lastName", employee.getLastName());
		request.getRequestDispatcher("/success.jsp").forward(request, response);
	}

}