drop table employee_hobby;
drop table employee_salary;
drop table employee;
drop table hobby;
-- Create an employee database
-- create database employee;

-- Create a hobby table
create table hobby(
id int(20) not null auto_increment,
name varchar(50) not null,
primary key (id)
);

-- Create an employee table
create table employee(
id int(20) not null auto_increment,
first_name varchar(30) not null,
last_name varchar(30) not null,
age tinyint(20) not null,
mobile_number varchar(20) not null,
address varchar(70) not null,
primary key (id)
);

-- Create an employee_salary table
create table employee_salary(
id int(20) NOT NULL auto_increment,
salary decimal(8,2) not null,
date date not null,
fk_employee_id int(20) not null,
foreign key (fk_employee_id) references employee(id) on delete cascade,
primary key (id)
);

-- Create an employee_hobby table
create table employee_hobby(
id int(20) not null auto_increment,
fk_employee_id int(20) not null,
foreign key (fk_employee_id) references employee(id) on delete cascade,
fk_hobby_id int(20) not null,
foreign key (fk_hobby_id) references hobby(id) on delete cascade,
primary key (id)
);

-- Insert multiple data into hobby table
insert into hobby(id, name) values(1, 'singing');
insert into hobby(id, name) values(2, 'dancing');
insert into hobby(id, name) values(3, 'reading');
insert into hobby(id, name) values(4, 'writing');
insert into hobby(id, name) values(5, 'cooking');

-- Insert multiple data into employee table
insert into employee(id, first_name, last_name, age, mobile_number, address)
values(101, 'Ram', 'Patel', 25, 8160155499, '20, Tulip Bunglows, Ranip, Ahmedabad');
insert into employee(id, first_name, last_name, age, mobile_number, address)
values(102, 'Ramesh', 'Parmar', 22, 9956244615, '56, Pranami Bunglows, Chandkheda, Ahmedabad');
insert into employee(id, first_name, last_name, age, mobile_number, address)
values(103, 'Ghanshyam', 'Prajapati', 25, 9055484465, '99, Golden Bunglows, Nikol, Ahmedabad');
insert into employee(id, first_name, last_name, age, mobile_number, address)
values(104, 'Suresh', 'Patil', 30, 6381616446, 'B-201, Sharanam Sky, Nikol, Ahmedabad');
insert into employee(id, first_name, last_name, age, mobile_number, address)
values(105, 'Kalyan', 'Kachiya', 24, 8166476616, 'C-104, Arvind Apartment, Athva, Surat');

-- Insert multiple data into employee_salary table
insert into employee_salary(salary, date, fk_employee_id)
values(0.00, '2022-02-01', 101);
insert into employee_salary(salary, date, fk_employee_id)
values(12000.00, '2022-03-01', 101);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-15', 101);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-01', 101);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-15', 101);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-01', 101);
insert into employee_salary(salary, date, fk_employee_id)
values(0.00, '2022-02-01', 102);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-15', 102);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-01', 102);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-15', 102);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-01', 102);
insert into employee_salary(salary, date, fk_employee_id)
values(0.00, '2022-02-01', 103);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-15', 103);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-01', 103);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-15', 103);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-01', 103);
insert into employee_salary(salary, date, fk_employee_id)
values(0.00, '2022-02-01', 104);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-15', 104);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-01', 104);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-15', 104);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-01', 104);
insert into employee_salary(salary, date, fk_employee_id)
values(0.00, '2022-02-01', 105);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-15', 105);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-01', 105);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-15', 105);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-01', 105);

-- Insert multiple data into employee_hobby table
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(1, 101, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(2, 102, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(3, 103, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(4, 104, 4);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(5, 105, 5);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(6, 101, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(7, 101, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(8, 101, 4);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(9, 101, 5);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(10, 102, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(11, 102, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(12, 102, 4);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(13, 102, 5);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(14, 103, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(15, 103, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(16, 103, 4);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(17, 103, 5);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(18, 104, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(19, 104, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(20, 104, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(21, 104, 5);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(22, 105, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(23, 105, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(24, 105, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(25, 105, 4);

-- Describe table details
describe employee_hobby;
describe employee_salary;
describe employee;
describe hobby;

-- Display all table
select * from employee_hobby;
select * from employee_salary;
select * from employee;
select * from hobby;

-- Delete record of employee 105 from all table 
-- delete employee_salary, employee from employee_salary inner join employee on employee_salary.fk_employee_id = employee.id where employee.id = 105;
delete employee, employee_salary, employee_hobby from employee, employee_salary, employee_hobby where employee.id = 105 and employee.id = employee_salary.fk_employee_id and employee.id = employee_hobby.fk_employee_id;

-- Update record of employee 104 from employee
UPDATE employee
SET 
    first_name = 'Kinjal',
    last_name = 'Patel',
    address = 'A-101, Yogeshwar Residency, Krishnanagar, Ahmedabad'
WHERE
    employee.id = 104;
    
-- After delete, display all table
select * from employee order by employee.id;
select * from employee_salary order by employee_salary.fk_employee_id;
select * from employee_hobby order by employee_hobby.fk_employee_id;

-- After delete, insert deleted data of employee 105 into all table
insert into employee(id, first_name, last_name, age, mobile_number, address)
values(105, 'Kalyan', 'Kachiya', 24, 8166476616, 'C-104, Arvind Apartment, Athva, Surat');
insert into employee_salary(salary, date, fk_employee_id)
values(0.00, '2022-02-01', 105);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-15', 105);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-01', 105);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-15', 105);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-01', 105);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(5, 105, 5);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(22, 105, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(23, 105, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(24, 105, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(25, 105, 4);

-- Truncate all table
set foreign_key_checks = 0;
truncate table employee_hobby;
truncate table employee_salary;
truncate table employee;
truncate table hobby;
set foreign_key_checks = 1;

-- After truncate all table, again insert all data into all table
-- Insert multiple data into hobby table
insert into hobby(id, name) values(1, 'singing');
insert into hobby(id, name) values(2, 'dancing');
insert into hobby(id, name) values(3, 'reading');
insert into hobby(id, name) values(4, 'writing');
insert into hobby(id, name) values(5, 'cooking');
-- Insert multiple data into employee table
insert into employee(id, first_name, last_name, age, mobile_number, address)
values(101, 'Ram', 'Patel', 25, 8160155499, '20, Tulip Bunglows, Ranip, Ahmedabad');
insert into employee(id, first_name, last_name, age, mobile_number, address)
values(102, 'Ramesh', 'Parmar', 22, 9956244615, '56, Pranami Bunglows, Chandkheda, Ahmedabad');
insert into employee(id, first_name, last_name, age, mobile_number, address)
values(103, 'Ghanshyam', 'Prajapati', 25, 9055484465, '99, Golden Bunglows, Nikol, Ahmedabad');
insert into employee(id, first_name, last_name, age, mobile_number, address)
values(104, 'Suresh', 'Patil', 30, 6381616446, 'B-201, Sharanam Sky, Nikol, Ahmedabad');
insert into employee(id, first_name, last_name, age, mobile_number, address)
values(105, 'Kalyan', 'Kachiya', 24, 8166476616, 'C-104, Arvind Apartment, Athva, Surat');
-- Insert multiple data into employee_salary table
insert into employee_salary(salary, date, fk_employee_id)
values(0.00, '2022-02-01', 101);
insert into employee_salary(salary, date, fk_employee_id)
values(12000.00, '2022-03-01', 101);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-15', 101);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-01', 101);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-15', 101);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-01', 101);
insert into employee_salary(salary, date, fk_employee_id)
values(0.00, '2022-02-01', 102);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-15', 102);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-01', 102);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-15', 102);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-01', 102);
insert into employee_salary(salary, date, fk_employee_id)
values(0.00, '2022-02-01', 103);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-15', 103);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-01', 103);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-15', 103);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-01', 103);
insert into employee_salary(salary, date, fk_employee_id)
values(0.00, '2022-02-01', 104);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-15', 104);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-01', 104);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-15', 104);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-01', 104);
insert into employee_salary(salary, date, fk_employee_id)
values(0.00, '2022-02-01', 105);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-15', 105);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2022-01-01', 105);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-15', 105);
insert into employee_salary(salary, date, fk_employee_id)
values(30000.00, '2021-12-01', 105);
-- Insert multiple data into employee_hobby table
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(1, 101, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(2, 102, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(3, 103, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(4, 104, 4);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(5, 105, 5);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(6, 101, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(7, 101, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(8, 101, 4);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(9, 101, 5);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(10, 102, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(11, 102, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(12, 102, 4);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(13, 102, 5);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(14, 103, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(15, 103, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(16, 103, 4);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(17, 103, 5);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(18, 104, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(19, 104, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(20, 104, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(21, 104, 5);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(22, 105, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(23, 105, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(24, 105, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(25, 105, 4);
-- Add duplicate hobby of employee
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(26, 101, 1);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(27, 102, 2);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(28, 103, 3);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(29, 104, 4);
insert into employee_hobby(id, fk_employee_id, fk_hobby_id)
values(30, 105, 5);

-- Get employee id and first_name and last_name and salary and date
select e.id, e.first_name, e.last_name, es.salary, es.date from employee as e, employee_salary as es;

-- Get employee name and employee hobby
SELECT 
    e.id,
    CONCAT(e.first_name, ' ', e.last_name) AS 'full_name',
    h.name AS 'employee_hobby'
FROM
    employee AS e,
    employee_hobby AS eh,
    hobby AS h
WHERE
    e.id = eh.fk_employee_id
        AND eh.fk_hobby_id = h.id;

-- Get employee name and salary datewise 
SELECT 
    e.id,
    CONCAT(e.first_name, ' ', e.last_name) AS 'full_name',
    es.salary,
    es.date
FROM
    employee_salary AS es,
    employee AS e
WHERE
    es.fk_employee_id = e.id;

-- Separate select query to get employee name and total salary 
select e.first_name, e.last_name, sum(salary) as 'total_salary' from employee_salary as es inner join employee as e on es.fk_employee_id = e.id group by e.id;

-- In above code, hobby is remaining
SELECT 
    e.id,
    CONCAT(e.first_name, ' ', e.last_name) AS 'full_name',
    SUM(salary) AS 'total_salary',
    (SELECT 
            GROUP_CONCAT(distinct h.name)
        FROM
            hobby AS h
                INNER JOIN
            employee_hobby AS eh ON eh.fk_hobby_id = h.id
                AND eh.fk_employee_id = e.id) AS 'employee_hobby'
FROM
    employee_salary AS es
        INNER JOIN
    employee AS e ON es.fk_employee_id = e.id
GROUP BY e.id;