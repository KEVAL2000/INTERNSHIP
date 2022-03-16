"use strict";

// For unique email validation Script
$(function() {
	$('#email').keyup(
		function() {
			var customerId = $("#customerNumber").val();
			var customerEmail = $("#email").val();
			$.ajax({
				url: "/customer/checkEmail",
				type: "POST",
				data: {
					id: customerId,
					email: customerEmail
				},
				success: function(result) {
					if (result == "duplicate") {
						$("#customerEmailCustomErrors").html(
							"Email is already registered! Please try another email.");
						$("#submitCustomerModalButton").prop("disabled", true);
					}
					if (result == "ok") {
						$("#customerEmailCustomErrors").html(
							"");
						$("#submitCustomerModalButton").prop("disabled", false);
					}
				}
			});
		});
});

// For unique mobile number validation Script
$(function() {
	$('#mobileNumber').keyup(
		function() {
			var customerId = $("#customerNumber").val();
			var customerMobileNumber = $("#mobileNumber").val();
			$.ajax({
				url: "/customer/checkMobileNumber",
				type: "POST",
				data: {
					id: customerId,
					mobileNumber: customerMobileNumber
				},
				success: function(result) {
					if (result == "duplicate") {
						$("#customerMobileNumberCustomErrors").html(
							"Mobile number is already registered! Please try another mobile number.");
						$("#submitCustomerModalButton").prop("disabled", true);
					}
					if (result == "ok") {
						$("#customerMobileNumberCustomErrors").html(
							"");
						$("#submitCustomerModalButton").prop("disabled", false);
					}
				}
			});
		});
});

// For close customer modal Script
$('document').ready(function() {
	$('#closeCustomerModalButton').on('click', function() {
		$('#customerForm').find("input[type=text],input[type=number],input[type=email], textarea")
			.val("")
			.prop('checked', false)
			.prop('selected', false)
			.removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input');
		$("#customerNumber").val("0");
		$("#customerFirstNameInputErrors").empty();
		$("#firstName").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').removeClass("block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input").addClass('block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input');
		$("#customerLastNameInputErrors").empty();
		$("#lastName").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').removeClass("block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input").addClass('block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input');
		$("#customerDateOfBirthInputErrors").empty();
		$("#dateOfBirth").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').removeClass("block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input").addClass('block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input');
		$("#customerMobileNumberInputErrors").empty();
		$("#mobileNumber").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').removeClass("block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input").addClass('block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input');
		$("#customerAddressOneInputErrors").empty();
		$("#addressOne").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').removeClass("block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input").addClass('block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input');
		$("#customerAddressTwoInputErrors").empty();
		$("#addressTwo").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').removeClass("block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input").addClass('block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input');
		$("#customerAgeInputErrors").empty();
		$("#age").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').removeClass("block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input").addClass('block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input');
		$("#customerGenderInputErrors").empty();
		$("#gender").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-select').removeClass("block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-select").addClass('block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-select');
		$("#customerEmailInputErrors").empty();
		$("#email").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').removeClass("block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input").addClass('block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input');
		$("#customerMessage").text("").removeClass("text-xs text-red-600 dark:text-red-400");
	})
});

// For create and update modal title change Script
$('document').ready(function() {
	$('#createCustomerModalButton').on('click', function() {
		$("#customerModalTitle").text('Create Customer');
	})
	$('#updateCustomerModalButton').on('click', function() {
		$("#customerModalTitle").text('Update Customer');
	})
});

// For date and age validation Script
duDatepicker('#dateOfBirth', {
	auto: true,
	inline: true,
	maxDate: 'today',
	format: 'dd/mm/yyyy',
	theme: 'blue'
});
function calculateAge() {
	var todayDate = new Date();
	var birthDate = document.getElementById("dateOfBirth").value;
	var from = birthDate.split("/");
	var birthDateTimeStamp = new Date(from[2], from[1] - 1, from[0]);
	var difference = todayDate - birthDateTimeStamp;
	var currentAge = Math.floor(difference / 31557600000);
	document.getElementById('age').value = currentAge;
}

// For front end validation Script
$("#customerForm2").validate({
	rules: {
		firstName: {
			required: true,
			minlength: 2,
			maxlength: 20
		},
		lastName: "required",
		dateOfBirth: "required",
		mobileNumber: {
			required: true,
			number: true,
			minlength: 10,
			maxlength: 10
		},
		addressOne: "required",
		addressTwo: "required",
		age: "required",
		gender: "required",
		email: {
			required: true,
			email: true
		}
	},
	messages: {
		firstName: {
			required: "First name can't be empty",
			minlength: jQuery.validator.format("First name have more than {0} characters "),
			maxlength: jQuery.validator.format("Last name can't have more than {0} characters")
		},
		lastName: "Last name can't be empty",
		dateOfBirth: "Date of birth can't be empty",
		mobileNumber: {
			required: "Mobile number can't be empty",
			number: "Mobile number should have only numbers",
			minlength: jQuery.validator.format("Mobile nymber should have 10 digits"),
			maxlength: jQuery.validator.format("Mobile nymber should have 10 digits")
		},
		addressOne: "Address can't be empty",
		addressTwo: "Address can't be empty",
		age: "Age can't be empty",
		gender: "Gender can't be empty",
		email: {
			required: "Email can't be empty",
			email: "Please enter a valid email"
		}
	}
});

// For server side validation Script
$("#customerForm").submit(function() {
	if (!$(this).attr("validated")) {
		$("#customerFirstNameInputErrors").empty();
		$("#customerLastNameInputErrors").empty();
		$("#customerDateOfBirthInputErrors").empty();
		$("#customerMobileNumberInputErrors").empty();
		$("#customerAddressOneInputErrors").empty();
		$("#customerAddressTwoInputErrors").empty();
		$("#customerAgeInputErrors").empty();
		$("#customerGenderInputErrors").empty();
		$("#customerEmailInputErrors").empty();

	//	let form = $(this);
		var enteredId = $("#customerNumber").val();
		var enteredFirstName = $("#firstName").val();
		var enteredLastName = $("#lastName").val();
		var enteredDateOfBirth = $("#dateOfBirth").val();
		var enteredMobileNumber = $("#mobileNumber").val();
		var enteredAddressOne = $("#addressOne").val();
		var enteredAddressTwo = $("#addressTwo").val();
		var enteredAge = $("#age").val();
		var enteredGender = $("#gender").val();
		var enteredEmail = $("#email").val();		
		
		let url = "/customer/check";

		$.ajax({
			type: "POST",
			url: url,
	//		data: form.serialize(),
			data: {
				id: enteredId,
				firstName: enteredFirstName,
				lastName: enteredLastName,
				dateOfBirth: enteredDateOfBirth,
				mobileNumber: enteredMobileNumber,
				addressOne: enteredAddressOne,
				addressTwo: enteredAddressTwo,
				age: enteredAge,
				gender: enteredGender,
				email: enteredEmail
			},
			success: function(response) {
				if (response.validated === false) {
					$("#customerMessage").text("Please use valid values").addClass("text-xs text-red-600 dark:text-red-400");
					let firstNameErrors = response.errorMessages.firstName;
					if (firstNameErrors !== undefined) {
						$("#firstName").addClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input');
						for (let i = 0; i < firstNameErrors.length; i++) {
							if (firstNameErrors[i] != null) {
								$("#customerFirstNameInputErrors").append("<li>" + firstNameErrors[i] + '</li>');
							}
						}
					} else {
						$("#firstName").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').addClass('block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input');
					}
					let lastNameErrors = response.errorMessages.lastName;
					if (lastNameErrors !== undefined) {
						$("#lastName").addClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input');
						for (let i = 0; i < lastNameErrors.length; i++) {
							if (lastNameErrors[i] != null) {
								$("#customerLastNameInputErrors").append("<li>" + lastNameErrors[i] + '</li>');
							}
						}
					} else {
						$("#lastName").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').addClass('block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input');
					}
					let dateOfBirthErrors = response.errorMessages.dateOfBirth;
					if (dateOfBirthErrors !== undefined) {
						$("#dateOfBirth").addClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input');
						for (let i = 0; i < dateOfBirthErrors.length; i++) {
							if (dateOfBirthErrors[i] != null) {
								$("#customerDateOfBirthInputErrors").append("<li>" + dateOfBirthErrors[i] + '</li>');
							}
						}
					} else {
						$("#dateOfBirth").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').addClass('block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input');
					}
					let mobileNumberErrors = response.errorMessages.mobileNumber;
					if (mobileNumberErrors !== undefined) {
						$("#mobileNumber").addClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input');
						for (let i = 0; i < mobileNumberErrors.length; i++) {
							if (mobileNumberErrors[i] != null) {
								$("#customerMobileNumberInputErrors").append("<li>" + mobileNumberErrors[i] + '</li>');
							}
						}
					} else {
						$("#mobileNumber").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').addClass('block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input');
					}
					let addressOneErrors = response.errorMessages.addressOne;
					if (addressOneErrors !== undefined) {
						$("#addressOne").addClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input');
						for (let i = 0; i < addressOneErrors.length; i++) {
							if (addressOneErrors[i] != null) {
								$("#customerAddressOneInputErrors").append("<li>" + addressOneErrors[i] + '</li>');
							}
						}
					} else {
						$("#addressOne").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').addClass('block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input');
					}
					let addressTwoErrors = response.errorMessages.addressTwo;
					if (addressTwoErrors !== undefined) {
						$("#addressTwo").addClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input');
						for (let i = 0; i < addressTwoErrors.length; i++) {
							if (addressTwoErrors[i] != null) {
								$("#customerAddressTwoInputErrors").append("<li>" + addressTwoErrors[i] + '</li>');
							}
						}
					} else {
						$("#addressTwo").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').addClass('block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input');
					}
					let ageErrors = response.errorMessages.age;
					if (ageErrors !== undefined) {
						$("#age").addClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input');
						for (let i = 0; i < ageErrors.length; i++) {
							if (ageErrors[i] != null) {
								$("#customerAgeInputErrors").append("<li>" + ageErrors[i] + '</li>');
							}
						}
					} else {
						$("#age").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').addClass('block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input');
					}
					let genderErrors = response.errorMessages.gender;
					if (genderErrors !== undefined) {
						$("#gender").addClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-select');
						for (let i = 0; i < genderErrors.length; i++) {
							if (genderErrors[i] != null) {
								$("#customerGenderInputErrors").append("<li>" + genderErrors[i] + '</li>');
							}
						}
					} else {
						$("#gender").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-select').addClass('block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-select');
					}
					let emailErrors = response.errorMessages.email;
					if (emailErrors !== undefined) {
						$("#email").addClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input');
						for (let i = 0; i < emailErrors.length; i++) {
							if (emailErrors[i] != null) {
								$("#customerEmailInputErrors").append("<li>" + emailErrors[i] + '</li>');
							}
						}
					} else {
						$("#email").removeClass('block w-full mt-1 text-sm border-red-600 dark:text-gray-300 dark:bg-gray-700 focus:border-red-400 focus:outline-none focus:shadow-outline-red form-input').addClass('block w-full mt-1 text-sm border-green-600 dark:text-gray-300 dark:bg-gray-700 focus:border-green-400 focus:outline-none focus:shadow-outline-green form-input');
					}
				}
				if (response.validated === true) {
					$("#customerForm").attr("validated", true);
					$("#customerForm").submit();
				}
			}

		});
		return false;
	}
	return true;
});

// For date of birth validation Script
function validateDateOfBirth() {
	var enteredDateOfBirth = document.getElementById("dateOfBirth").value;
	var regexDateOfBirth = /(((0|1)[0-9]|2[0-9]|3[0-1])\/(0[1-9]|1[0-2])\/((19|20)\d\d))$/;
	if (enteredDateOfBirth == null || enteredDateOfBirth == "") {
		document.getElementById("customerDateOfBirthCustomErrors").innerHTML = "Please choose a valid date of birth";
		return false;
	} else if (!regexDateOfBirth.test(enteredDateOfBirth)) {
		document.getElementById("customerDateOfBirthCustomErrors").innerHTML = "Please enter date of birth like dd/MM/yyyy";
		return false;
	} else {
		document.getElementById("customerDateOfBirthCustomErrors").innerHTML = "";
		return true;
	}
}

// For mobile number validation Script
function validateMobileNumber() {
	var enteredMobileNumber = document.getElementById("mobileNumber").value;
	var regexMobileNumber = /[6-9][0-9]{9}/;
	if (!regexMobileNumber.test(enteredMobileNumber)) {
		document.getElementById("customerMobileNumberCustomErrors2").innerHTML = "Please enter mobile number which start with 6|7|8|9 digits";
		return false;
	} else {
		document.getElementById("customerMobileNumberCustomErrors2").innerHTML = "";
		return true;
	}
}

// For update customer Script
function updateCustomer(id) {
	$.ajax({
		url: "/customer/get",
		type: "POST",
		timeout: 1000,
		data: {
			id: id
		},
		success: function(customer) {
			$("#customerNumber").val(customer.id);
			$("#firstName").val(customer.firstName);
			$("#lastName").val(customer.lastName);
			$("#dateOfBirth").val(customer.dateOfBirth);
			$("#mobileNumber").val(customer.mobileNumber);
			$("#addressOne").val(customer.addressOne);
			$("#addressTwo").val(customer.addressTwo);
			$("#age").val(customer.age);
			$("#gender").val(customer.gender);
			$("#email").val(customer.email);
		}
	})
}

// For delete customer Script
function deleteCustomer(id) {
	$.ajax({
		url: "/customer/get",
		type: "POST",
		timeout: 1000,
		data: {
			id: id
		},
		success: function(customer) {
			$("#deleteBodyText").text(
				"Are you sure you want to permanently delete " + '"' + customer.firstName +
				" " + customer.lastName + '"' + "?"
			);
			$("#deleteCustomerNumber").val(customer.id);
			$("#deleteCustomerFirstName").val(customer.firstName);
			$("#deleteCustomerLastName").val(customer.lastName);
			$("#deleteCustomerDateOfBirth").val(customer.dateOfBirth);
			$("#deleteCustomerMobileNumber").val(customer.mobileNumber);
			$("#deleteCustomerAddressOne").val(customer.addressOne);
			$("#deleteCustomerAddressTwo").val(customer.addressTwo);
			$("#deleteCustomerAge").val(customer.age);
			$("#deleteCustomerGender").val(customer.gender);
			$("#deleteCustomerEmail").val(customer.email);
		}
	})
}