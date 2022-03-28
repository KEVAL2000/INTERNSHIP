package com.java.customercrud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private Long id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String mobileNumber;
	private String addressOne;
	private String addressTwo;
	private String age;
	private String gender;
	private String email;

}