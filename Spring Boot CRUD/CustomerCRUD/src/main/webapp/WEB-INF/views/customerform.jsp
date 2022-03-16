<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html :class="{ 'theme-dark': dark }" x-data="data()" lang="en">

<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>QDev Technolab Dashboard</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font.googleapis.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/tailwind.output.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/duDatepicker.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/duDatepicker-theme.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/customer.css">
</head>

<body>

	<!-- Start create and update modal -->
	<div id="customerModal" x-show="isModalOpen" x-transition:enter="transition ease-out duration-150" x-transition:enter-start="opacity-0" x-transition:enter-end="opacity-100" x-transition:leave="transition ease-in duration-150" x-transition:leave-start="opacity-100" x-transition:leave-end="opacity-0"
		class="fixed inset-0 z-30 flex items-end bg-black bg-opacity-50 sm:items-center sm:justify-center" style="margin-bottom: 20px; margin-top: 20px;">
		<!-- Modal -->
		<div x-show="isModalOpen" x-transition:enter="transition ease-out duration-150" x-transition:enter-start="opacity-0 transform translate-y-1/2" x-transition:enter-end="opacity-100" x-transition:leave="transition ease-in duration-150" x-transition:leave-start="opacity-100"
			x-transition:leave-end="opacity-0  transform translate-y-1/2" @click.away="closeCustomerModal" @keydown.escape="closeCustomerModal" class="w-full h-full px-6 py-4 overflow-x-auto bg-white rounded-t-lg dark:bg-gray-800 sm:rounded-lg sm:m-4 sm:max-w-xl" role="dialog" id="customerModal">
			<!-- Remove header if you don't want a close icon. Use modal body to place modal tile. -->
			<header class="flex justify-end">
				<button class="inline-flex items-center justify-center w-6 h-6 text-gray-400 transition-colors duration-150 rounded dark:hover:text-gray-200 hover: hover:text-gray-700" aria-label="close" @click="closeCustomerModal" id="closeCustomerModalButton">
					<svg class="w-4 h-4" fill="currentColor" viewBox="0 0 20 20" role="img" aria-hidden="true">
						<path d="M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z" clip-rule="evenodd" fill-rule="evenodd">
						</path>
					</svg>
				</button>
			</header>
			<!-- Modal body -->
			<div class="mt-4 mb-6">
				<!-- Modal title -->
				<p class="mb-2 text-lg font-semibold text-gray-700 dark:text-gray-300" id="customerModalTitle">Create And Update Customer</p>
				<!-- Modal description -->
				<p class="text-sm text-gray-700 dark:text-gray-400"></p>
				<!-- Modal body -->
				<form:form id="customerForm" action="save" method="post" modelAttribute="customer">
					<div class="px-4 py-3 mb-8 bg-white rounded-lg shadow-md dark:bg-gray-800">

						<input type="hidden" id="customerNumber" name="id" value="0">

						<form:label path="firstName" cssClass="block text-sm">
							<span class="text-gray-700 dark:text-gray-400">First Name<b>*</b></span>
						</form:label>
						<form:input type="text" path="firstName" id="firstName" oninput="this.value=this.value.replace(/[^a-z^A-Z]/g,'');"
							cssClass="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input" />
						<ul id="customerFirstNameInputErrors" class="text-xs text-red-600 dark:text-red-400 list-unstyled"></ul>

						<br>

						<form:label path="lastName" cssClass="block text-sm">
							<span class="text-gray-700 dark:text-gray-400">Last Name<b>*</b></span>
						</form:label>
						<form:input type="text" path="lastName" id="lastName" oninput="this.value=this.value.replace(/[^a-z^A-Z]/g,'');"
							cssClass="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input" />
						<ul id="customerLastNameInputErrors" class="text-xs text-red-600 dark:text-red-400 list-unstyled"></ul>

						<br>

						<form:label path="dateOfBirth" cssClass="block text-sm">
							<span class="text-gray-700 dark:text-gray-400">Date Of Birth<b>*</b></span>
						</form:label>
						<form:input type="text" path="dateOfBirth" id="dateOfBirth" data-theme="blue" onblur="calculateAge();"
							cssClass="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input" readonly="true" />
						<ul id="customerDateOfBirthInputErrors" class="text-xs text-red-600 dark:text-red-400 list-unstyled"></ul>
						<span class="text-xs text-red-600 dark:text-red-400" id="customerDateOfBirthCustomErrors"></span> <br>

						<form:label path="mobileNumber" cssClass="block text-sm">
							<span class="text-gray-700 dark:text-gray-400">Mobile Number<b>*</b></span>
						</form:label>
						<form:input type="text" path="mobileNumber" id="mobileNumber" onkeydown="validateMobileNumber()" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" pattern="[6789][0-9]{9}" title="Mobile number should have only 10 digits"
							cssClass="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input" />
						<ul id="customerMobileNumberInputErrors" class="text-xs text-red-600 dark:text-red-400 list-unstyled"></ul>
						<span class="text-xs text-red-600 dark:text-red-400" id="customerMobileNumberCustomErrors"></span>
						<span class="text-xs text-red-600 dark:text-red-400" id="customerMobileNumberCustomErrors2"></span>

						<form:label path="addressOne" cssClass="block mt-4 text-sm">
							<span class="text-gray-700 dark:text-gray-400">Address<b>*</b></span>
						</form:label>
						<form:textarea type="text" path="addressOne" id="addressOne" cssClass="block w-full mt-1 text-sm dark:text-gray-300 dark:border-gray-600 dark:bg-gray-700 form-textarea focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray" rows="1"></form:textarea>
						<ul id="customerAddressOneInputErrors" class="text-xs text-red-600 dark:text-red-400 list-unstyled"></ul>

						<form:label path="addressTwo" cssClass="block mt-4 text-sm">
							<span class="text-gray-700 dark:text-gray-400">Address 2</span>
						</form:label>
						<form:textarea type="text" path="addressTwo" id="addressTwo" cssClass="block w-full mt-1 text-sm dark:text-gray-300 dark:border-gray-600 dark:bg-gray-700 form-textarea focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray" rows="1"></form:textarea>
						<ul id="customerAddressTwoInputErrors" class="text-xs text-red-600 dark:text-red-400 list-unstyled"></ul>

						<br>

						<form:label path="age" cssClass="block text-sm">
							<span class="text-gray-700 dark:text-gray-400">Age<b>*</b></span>
						</form:label>
						<form:input type="number" path="age" id="age" value="" cssClass="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input" readonly="true" />
						<ul id="customerAgeInputErrors" class="text-xs text-red-600 dark:text-red-400 list-unstyled"></ul>
						<span class="text-xs text-red-600 dark:text-red-400" id="customerAgeCustomErrors"></span>

						<form:label path="gender" cssClass="block mt-4 text-sm">
							<span class="text-gray-700 dark:text-gray-400">Gender<b>*</b></span>
						</form:label>
						<form:select path="gender" id="gender" cssClass="block w-full mt-1 text-sm dark:text-gray-300 dark:border-gray-600 dark:bg-gray-700 form-select focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray">
							<form:option value="NONE" label="Select"></form:option>
							<form:option value="M" label="Male"></form:option>
							<form:option value="F" label="Female"></form:option>
						</form:select>
						<ul id="customerGenderInputErrors" class="text-xs text-red-600 dark:text-red-400 list-unstyled"></ul>

						<br>

						<form:label path="email" cssClass="block text-sm">
							<span class="text-gray-700 dark:text-gray-400">Email<b>*</b></span>
						</form:label>
						<form:input type="text" path="email" id="email" cssClass="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input" />
						<ul id="customerEmailInputErrors" class="text-xs text-red-600 dark:text-red-400 list-unstyled"></ul>
						<span class="text-xs text-red-600 dark:text-red-400" id="customerEmailCustomErrors"></span>

						<div class="flex mt-6 text-sm">
							<label class="flex items-center dark:text-gray-400"> <input type="checkbox" checked class="text-purple-600 form-checkbox focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray" /> <span class="ml-2">I agree to the<span
									class="underline">privacy policy</span></span>
							</label>
						</div>
					</div>

					<footer class="flex flex-col items-center justify-end px-6 py-3 -mx-6 -mb-4 space-y-4 sm:space-y-0 sm:space-x-6 sm:flex-row bg-gray-50 dark:bg-gray-800">
						<span id="customerMessage" class="text-xs text-green-600 dark:text-green-400"></span>
						<button @click="closeCustomerModal" type="button"
							class="w-full px-5 py-3 text-sm font-medium leading-5 text-white text-gray-700 transition-colors duration-150 border border-gray-300 rounded-lg dark:text-gray-400 sm:px-4 sm:py-2 sm:w-auto active:bg-transparent hover:border-gray-500 focus:border-gray-500 active:text-gray-500 focus:outline-none focus:shadow-outline-gray"
							id="closeCustomerModalButton">Cancel</button>
						<button type="submit" class="w-full px-5 py-3 text-sm font-medium leading-5 text-white transition-colors duration-150 bg-purple-600 border border-transparent rounded-lg sm:w-auto sm:px-4 sm:py-2 active:bg-purple-600 hover:bg-purple-700 focus:outline-none focus:shadow-outline-purple"
							id="submitCustomerModalButton">Submit</button>
					</footer>

				</form:form>
			</div>
		</div>
	</div>
	<!-- End of create and update modal -->

	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/alpine.min.js" defer></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/init-alpine.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/focus-trap.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/customer.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/duDatepicker.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.validate.min.js"></script>

</body>

</html>