<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form"%>
<!-- Form -->
<jsp:include page="customerform.jsp" />

<!DOCTYPE html>
<html :class="{ 'theme-dark': dark }" x-data="data()" lang="en">

<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>QDev Technolab Dashboard</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font.googleapis.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/tailwind.output.css" />
</head>

<body>

	<div class="flex h-screen bg-gray-50 dark:bg-gray-900" :class="{ 'overflow-hidden': isSideMenuOpen }">

		<!-- Side bar -->
		<jsp:include page="sidebar.jsp" />

		<div class="flex flex-col flex-1 w-full">

			<!-- Header -->
			<jsp:include page="header.jsp" />

			<main class="h-full overflow-y-auto">
				<div class="container px-6 mx-auto grid">
					<h2 class="my-6 text-2xl font-semibold text-gray-700 dark:text-gray-200">Customer Information</h2>

					<!-- Alert Message -->
					<c:if test="${not empty message}">
						<div class="px-4 py-3 mb-8 bg-white rounded-lg shadow-md dark:bg-gray-800">
							<p class="text-sm text-gray-600 dark:text-gray-400">${message}</p>
						</div>
					</c:if>

					<!-- Table With actions -->
					<h4 class="mb-4 text-lg font-semibold text-gray-600 dark:text-gray-300">
						<div style="font-size: larger;">
							List Of Customers
							<div style="float: right;">
								<button @click="openCustomerModal"
									class="flex items-center justify-between px-4 py-2 text-sm font-medium leading-5 text-white transition-colors duration-150 bg-purple-600 border border-transparent rounded-lg active:bg-purple-600 hover:bg-purple-700 focus:outline-none focus:shadow-outline-purple"
									id="createCustomerModalButton">
									<svg class="w-5 h-5 mr-2 -ml-1" fill="currentColor" aria-hidden="true" viewBox="0 0 20 20">
										<path
											d="M13.388,9.624h-3.011v-3.01c0-0.208-0.168-0.377-0.376-0.377S9.624,6.405,9.624,6.613v3.01H6.613c-0.208,0-0.376,0.168-0.376,0.376s0.168,0.376,0.376,0.376h3.011v3.01c0,0.208,0.168,0.378,0.376,0.378s0.376-0.17,0.376-0.378v-3.01h3.011c0.207,0,0.377-0.168,0.377-0.376S13.595,9.624,13.388,9.624z M10,1.344c-4.781,0-8.656,3.875-8.656,8.656c0,4.781,3.875,8.656,8.656,8.656c4.781,0,8.656-3.875,8.656-8.656C18.656,5.219,14.781,1.344,10,1.344z M10,17.903c-4.365,0-7.904-3.538-7.904-7.903S5.635,2.096,10,2.096S17.903,5.635,17.903,10S14.365,17.903,10,17.903z"
											clip-rule="evenodd" fill-rule="evenodd">
										</path>
									</svg>
									<span>Create</span>
								</button>
							</div>
						</div>
					</h4>
					<div class="w-full overflow-hidden rounded-lg shadow-xs">
						<div class="w-full overflow-x-auto">
							<table class="w-full whitespace-no-wrap" id="customerTable">
								<thead>
									<tr class="text-xs font-semibold tracking-wide text-left text-gray-500 uppercase border-b dark:border-gray-700 bg-gray-50 dark:text-gray-400 dark:bg-gray-800">
										<th class="px-4 py-3">ID</th>
										<th class="px-4 py-3">Name</th>
										<th class="px-4 py-3">Date Of Birth</th>
										<th class="px-4 py-3">Mobile Number</th>
										<th class="px-4 py-3">Address</th>
										<th class="px-4 py-3">Age</th>
										<th class="px-4 py-3">Gender</th>
										<th class="px-4 py-3">Email</th>
										<th class="px-4 py-3">Actions</th>
									</tr>
								</thead>
								<tbody class="bg-white divide-y dark:divide-gray-700 dark:bg-gray-800">
									<c:forEach items="${customerList}" var="customer" varStatus="loop">
										<tr class="text-gray-700 dark:text-gray-400">
											<td class="px-4 py-3">
												<div class="flex items-center text-sm">
													<div>
														<p class="font-semibold">
															<c:out value="${loop.index + 1}" />
														</p>
													</div>
												</div>
											</td>
											<td class="px-4 py-3 text-sm">${customer.firstName}<br> ${customer.lastName}
											</td>
											<td class="px-4 py-3 text-sm">${customer.dateOfBirth}</td>
											<td class="px-4 py-3 text-sm">${customer.mobileNumber}</td>
											<td class="px-4 py-3 text-sm">${customer.addressOne},<br>${customer.addressTwo}</td>
											<td class="px-4 py-3 text-sm">${customer.age}</td>
											<td class="px-4 py-3 text-sm">${customer.gender}</td>
											<td class="px-4 py-3 text-sm">${customer.email}</td>
											<td class="px-4 py-3">
												<div class="flex items-center space-x-4 text-sm">

													<button @click="openCustomerModal" onclick="updateCustomer(${customer.id})" class="flex items-center justify-between px-2 py-2 text-sm font-medium leading-5 text-purple-600 rounded-lg dark:text-gray-400 focus:outline-none focus:shadow-outline-gray" aria-label="Edit"
														id="updateCustomerModalButton">
														<svg class="w-5 h-5" aria-hidden="true" fill="currentColor" viewBox="0 0 20 20">
															<path d="M13.586 3.586a2 2 0 112.828 2.828l-.793.793-2.828-2.828.793-.793zM11.379 5.793L3 14.172V17h2.828l8.38-8.379-2.83-2.828z">
															</path>
														</svg>
													</button>
													<button @click="openDeleteModal" onclick="deleteCustomer(${customer.id})" class="flex items-center justify-between px-2 py-2 text-sm font-medium leading-5 text-purple-600 rounded-lg dark:text-gray-400 focus:outline-none focus:shadow-outline-gray" aria-label="Delete"
														id="deleteCustomerModalButton">
														<svg class="w-5 h-5" aria-hidden="true" fill="currentColor" viewBox="0 0 20 20">
															<path fill-rule="evenodd" d="M9 2a1 1 0 00-.894.553L7.382 4H4a1 1 0 000 2v10a2 2 0 002 2h8a2 2 0 002-2V6a1 1 0 100-2h-3.382l-.724-1.447A1 1 0 0011 2H9zM7 8a1 1 0 012 0v6a1 1 0 11-2 0V8zm5-1a1 1 0 00-1 1v6a1 1 0 102 0V8a1 1 0 00-1-1z" clip-rule="evenodd"></path>
														</svg>
													</button>
												</div>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</main>
		</div>
	</div>

	<!-- modal -->
	<jsp:include page="modal.jsp" />

	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/alpine.min.js" defer></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/init-alpine.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/focus-trap.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/customer.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>

</body>

</html>