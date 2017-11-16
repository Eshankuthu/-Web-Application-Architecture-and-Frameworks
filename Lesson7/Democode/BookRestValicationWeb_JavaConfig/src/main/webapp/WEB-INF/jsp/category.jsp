<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Category</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/ajax.js"/>"></script>

<link rel="stylesheet"
	href="<spring:url value="/resources/css/main.css"/>">
</head>

<body>
	<div id="global">
		<h1>Add Category</h1>
		<!-- Success - or Validation errors -->
		<div id="result">
		</div>

		<div id="formInput">
			<!-- No action method handled by AJAX-->
			<form id="categoryForm" method="post">
				<p>
					<label for="name"> Name : </label> 
					<input type="text" name="name" id="name" value="" />
				</p>
				<p>
					<label for="description"> Description: </label> 
					<input id="description" name="description" type="text" />
				</p>
				<input type="button" id="categorySubmitBtn" value="Add Category"/>
			</form>
		</div>
	</div>

</body>
</html>
