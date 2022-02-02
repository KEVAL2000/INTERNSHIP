-- Create a new company database
create database company;

-- Use company database
use company;

-- Create a job table
CREATE TABLE job (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    min_salary DECIMAL(7 , 2 ) NULL,
    max_salary DECIMAL(7 , 2 ) NULL,
    PRIMARY KEY (id)
);

-- Create a country table
CREATE TABLE country (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
);

-- Create a department table
CREATE TABLE department (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    fk_country_id INT NOT NULL,
    FOREIGN KEY (fk_country_id)
        REFERENCES country (id)
        ON DELETE CASCADE ON UPDATE CASCADE,
    PRIMARY KEY (id)
);

-- Create an employee table
CREATE TABLE employee (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    email VARCHAR(50) NOT NULL,
    salary DECIMAL(7 , 2 ) NULL,
    fk_department_id INT NOT NULL,
    FOREIGN KEY (fk_department_id)
        REFERENCES department (id)
        ON DELETE CASCADE ON UPDATE CASCADE,
    fk_job_id INT NOT NULL,
    FOREIGN KEY (fk_job_id)
        REFERENCES job (id)
        ON DELETE CASCADE ON UPDATE CASCADE,
    PRIMARY KEY (id)
);

-- Insert multiple data into job table
insert into job(id, name, min_salary, max_salary) values(1, 'Jr. Physics Teacher', 10000.00, 20000.00);
insert into job(id, name, min_salary, max_salary) values(2, 'Jr. Finance Teacher', 11000.00, 21000.00);
insert into job(id, name, min_salary, max_salary) values(3, 'Jr. History Teacher', 12000.00, 22000.00);
insert into job(id, name, min_salary, max_salary) values(4, 'Jr. Biology Teacher', 13000.00, 23000.00);
insert into job(id, name, min_salary, max_salary) values(5, 'Jr. Music Teacher', 14000.00, 24000.00);
insert into job(id, name, min_salary, max_salary) values(6, 'Sr. Physics Teacher', 20000.00, 30000.00);
insert into job(id, name, min_salary, max_salary) values(7, 'Sr. Finance Teacher', 21000.00, 31000.00);
insert into job(id, name, min_salary, max_salary) values(8, 'Sr. History Teacher', 22000.00, 32000.00);
insert into job(id, name, min_salary, max_salary) values(9, 'Sr. Biology Teacher', 23000.00, 33000.00);
insert into job(id, name, min_salary, max_salary) values(10, 'Sr. Music Teacher', 24000.00, 34000.00);

-- Insert multiple data into country table
insert into country(id, name) values(1, 'India');
insert into country(id, name) values(2, 'USA');
insert into country(id, name) values(3, 'UAE');
insert into country(id, name) values(4, 'Europe');
insert into country(id, name) values(5, 'Dubai');

-- Insert multiple data into department table
insert into department(name, fk_country_id) values('Physics', 1);
insert into department(name, fk_country_id) values('Finance', 2);
insert into department(name, fk_country_id) values('History', 3);
insert into department(name, fk_country_id) values('Biology', 4);
insert into department(name, fk_country_id) values('Music', 5);

-- Insert multiple data into employee table
insert into employee(id, first_name, last_name, email, salary, fk_department_id, fk_job_id) values(101, 'Ram', 'Prajapati', 'ramprajapati@gmail.com', 15000.00, 1, 1);
insert into employee(id, first_name, last_name, email, salary, fk_department_id, fk_job_id) values(102, 'Kishan', 'Panchal', 'kishanpanchal@gmail.com', 25000.00, 1, 6);
insert into employee(id, first_name, last_name, email, salary, fk_department_id, fk_job_id) values(103, 'Krishna', 'Patel', 'krishnapatel@gmail.com', 16000.00, 2, 2);
insert into employee(id, first_name, last_name, email, salary, fk_department_id, fk_job_id) values(104, 'Meet', 'Lakhani', 'meetlakhani@gmail.com', 26000.00, 2, 7);
insert into employee(id, first_name, last_name, email, salary, fk_department_id, fk_job_id) values(105, 'Priyansh', 'Patil', 'priyanshpatil@gmail.com', 17000.00, 3, 3);
insert into employee(id, first_name, last_name, email, salary, fk_department_id, fk_job_id) values(106, 'Jay', 'Parmar', 'jayparmar@gmail.com', 27000.00, 3, 8);
insert into employee(id, first_name, last_name, email, salary, fk_department_id, fk_job_id) values(107, 'Vijay', 'Patel', 'vijaypatel@gmail.com', 18000.00, 4, 4);
insert into employee(id, first_name, last_name, email, salary, fk_department_id, fk_job_id) values(108, 'Raj', 'Kachiya', 'rajkachiya@gmail.com', 28000.00, 4, 9);
insert into employee(id, first_name, last_name, email, salary, fk_department_id, fk_job_id) values(109, 'Rushi', 'Patel', 'rushipatel@gmail.com', 19000.00, 5, 5);
insert into employee(id, first_name, last_name, email, salary, fk_department_id, fk_job_id) values(110, 'Ajay', 'Prajapati', 'ajayprajapati@gmail.com', 29000.00, 5, 10);

-- Display all table data
SELECT 
    *
FROM
    job;
SELECT 
    *
FROM
    country;
SELECT 
    *
FROM
    department;
SELECT 
    *
FROM
    employee;

-- Get first name and lastname as full name and department name and country name and job name
SELECT 
    e.id,
    CONCAT(e.first_name, ' ', e.last_name) AS 'full_name',
    d.name AS 'department_name',
    c.name AS 'country_name',
    j.name AS 'job_name'
FROM
    employee AS e
        LEFT JOIN
    department AS d ON d.id = e.fk_department_id
        LEFT JOIN
    job AS j ON j.id = e.fk_job_id
        LEFT JOIN
    country AS c ON c.id = d.fk_country_id
GROUP BY e.id;

-- Get second highest salary of the employee
SELECT 
    id,
    CONCAT(first_name, ' ', last_name) AS 'full_name',
    salary
FROM
    employee
ORDER BY salary DESC
LIMIT 1 , 1;

-- Get all job name and department name in single query
SELECT 
    name
FROM
    job 
UNION ALL SELECT 
    name
FROM
    department;