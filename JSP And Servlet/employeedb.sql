-- Create an employeedb database
create database employeedb;

-- Use an employeedb database
use employeedb;

-- Create an employee table
CREATE TABLE employee (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    user_name VARCHAR(15) NOT NULL,
    password VARCHAR(15) NOT NULL,
    address VARCHAR(50) NOT NULL,
    mobile_number VARCHAR(15) NOT NULL,
    PRIMARY KEY (id)
);

-- Truncate an employee table
truncate table employee;

-- Display an employee table
SELECT 
    *
FROM
    employee;