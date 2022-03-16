CREATE DATABASE `customerdb`;
CREATE TABLE `customer` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address_one` varchar(120) NOT NULL,
  `address_two` varchar(120) DEFAULT NULL,
  `age` int NOT NULL,
  `date_of_birth` varchar(10) NOT NULL,
  `email` varchar(75) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `gender` varchar(1) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `mobile_number` varchar(17) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_dwk6cx0afu8bs9o4t536v1j5v` (`email`),
  UNIQUE KEY `UK_5v8hijx47m783qo8i4sox2n5t` (`mobile_number`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
SELECT 
    `customer`.`id`,
    `customer`.`address_one`,
    `customer`.`address_two`,
    `customer`.`age`,
    `customer`.`date_of_birth`,
    `customer`.`email`,
    `customer`.`first_name`,
    `customer`.`gender`,
    `customer`.`last_name`,
    `customer`.`mobile_number`
FROM
    `customerdb`.`customer`;