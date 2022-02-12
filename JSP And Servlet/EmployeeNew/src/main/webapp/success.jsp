<%@ page import="com.employee.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Employee Registration Form</title>
<link rel="stylesheet" type="text/css" href="css/roboto-font.css">
<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-5/css/fontawesome-all.min.css">
<link
	href='https://fonts.googleapis.com/css?family=Lato:300,400|Montserrat:700'
	rel='stylesheet' type='text/css'>
<style>
@import
	url(//cdnjs.cloudflare.com/ajax/libs/normalize/3.0.1/normalize.min.css)
	;

@import
	url(//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css)
	;
</style>
<link rel="stylesheet"
	href="https://2-22-4-dot-lead-pages.appspot.com/static/lp918/min/default_thank_you.css">
<script
	src="https://2-22-4-dot-lead-pages.appspot.com/static/lp918/min/jquery-1.9.1.min.js"></script>
<script
	src="https://2-22-4-dot-lead-pages.appspot.com/static/lp918/min/html5shiv.js"></script>
</head>

<body>

	<div>
		<h2>Welcome ${firstName} ${lastName}...</h2>
		<h2>Your ${success}</h2>
	</div>

	<header class="site-header" id="header">
		<h1 class="site-header__title" data-lead-id="site-header-title">THANK
			YOU!</h1>
	</header>

	<div class="main-content">
		<i class="fa fa-check main-content__checkmark" id="checkmark"></i>
		<p class="main-content__body" data-lead-id="main-content-body"></p>
	</div>

	<footer class="site-footer" id="footer">
		<p class="site-footer__fineprint" id="fineprint">Copyright ©2022 |
			All Rights Reserved</p>
	</footer>

</body>

</html>