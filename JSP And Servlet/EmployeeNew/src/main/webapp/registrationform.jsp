<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Employee Registration Form</title>
	<link rel="stylesheet" href="registrationform.css" />
</head>

<body>

	<div class="wrapper">

		<div class="form_container">

			<form name="form" action="register" method="post">

				<div class="heading">
					<h2>Employee Registration Form</h2>
				</div>

				<div class="form_wrap fullname">
					<div class="form_item">
						<label>First Name</label> <input type="text" name="firstName"
							id="firstName"
							oninput="this.value=this.value.replace(/[^a-z^A-Z]/g,'');"
							placeholder="Your First Name..." required>
					</div>
					<div class="form_item">
						<label>Last Name</label> <input type="text" name="lastName"
							id="lastName"
							oninput="this.value=this.value.replace(/[^a-z^A-Z]/g,'');"
							placeholder="Your Last Name..." required>
					</div>
				</div>

				<div class="form_wrap">
					<div class="form_item">
						<label>User Name</label> <input type="text" name="userName"
							id="userName" placeholder="Your User Name..." required>
					</div>
				</div>

				<div class="form_wrap">
					<div class="form_item">
						<label>Password</label> <input type="password" name="password"
							id="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
							title="Password must contain at least one number and one uppercase and lowercase letter and at least 8 or more characters."
							placeholder="Your Password..." required>
					</div>
				</div>

				<div class="form_wrap">
					<div class="form_item">
						<label>Address</label> <input type="text" name="address"
							placeholder="Your Address..." required>
					</div>
				</div>

				<div class="form_wrap">
					<div class="form_item">
						<label>Mobile Number</label> <input type="text" id="mobileNumber"
							name="mobileNumber" pattern="[6789][0-9]{9}"
							oninput="this.value=this.value.replace(/[^0-9]/g,'');"
							title="Mobile Number should start with digit 6 or 7 or 8 or 9 and only have 10 digits."
							placeholder="Your Mobile Number..." required>
					</div>
				</div>

				<div class="btn">
					<input type="submit" value="Get Started">
				</div>

			</form>

		</div>

	</div>

</body>

</html>