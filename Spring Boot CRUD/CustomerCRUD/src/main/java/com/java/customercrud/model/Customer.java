package com.java.customercrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 2, max = 20, message = "First name must be between 2 and 20 characters long")
	@NotEmpty(message = "First name can't be empty")
	@Column(name = "first_name", length = 20, nullable = false, unique = false)
	private String firstName;

	@Size(min = 2, max = 20, message = "Last name must be between 2 and 20 characters long")
	@NotEmpty(message = "Last name can't be empty")
	@Column(name = "last_name", length = 20, nullable = false, unique = false)
	private String lastName;

	@NotEmpty(message = "Date of birth can't be empty")
	@Column(name = "date_of_birth", length = 10, nullable = false, unique = false)
	private String dateOfBirth;

	@Pattern(regexp = "(0/91)?[6-9][0-9]{9}", message = "Please enter a valid mobile number")
	@NotEmpty(message = "Mobile number can't be empty")
	@Column(name = "mobile_number", length = 17, nullable = false, unique = true)
	private String mobileNumber;

	@NotEmpty(message = "Address can't be empty")
	@Column(name = "address_one", length = 120, nullable = false, unique = false)
	private String addressOne;

	@NotEmpty(message = "Address can't be empty")
	@Column(name = "address_two", length = 120, nullable = true, unique = false)
	private String addressTwo;

	@Min(1)
	@Max(150)
	@NotNull(message = "Age can't be empty")
	@Column(name = "age", nullable = false, unique = false)
	private Integer age;

	@NotEmpty(message = "Gender can't be empty")
	@Column(name = "gender", length = 1, nullable = false, unique = false)
	private String gender;

	@Email(message = "Please enter a valid email")
	@NotEmpty(message = "Email can't be empty")
	@Column(name = "email", length = 75, nullable = false, unique = true)
	private String email;

}