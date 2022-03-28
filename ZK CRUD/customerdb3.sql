create database customerdb3;
use customerdb3;
CREATE TABLE customer (
    id BIGINT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    date_of_birth VARCHAR(10) NOT NULL,
    mobile_number VARCHAR(17) NOT NULL,
    address_one VARCHAR(120) NOT NULL,
    address_two VARCHAR(120) DEFAULT NULL,
    age INT NOT NULL,
    gender VARCHAR(1) NOT NULL,
    email VARCHAR(75) NOT NULL,
    PRIMARY KEY (id)
);
SELECT 
    *
FROM
    customer;