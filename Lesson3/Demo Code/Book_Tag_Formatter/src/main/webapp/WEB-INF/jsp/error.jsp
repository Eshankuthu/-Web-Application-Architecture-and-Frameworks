<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 
<% response.setStatus(403); %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>400 error</title>
  </head>
  <body>

<center>

<img src="<spring:url value="/resources/images/error_page.jpg" />" alt="Error Page!!!"  />

<H2>${requestScope['javax.servlet.error.message']}</H2>
  <p><button type=button onclick=window.location.href="<spring:url value="/book_list" />">Book List</button></p>

</center> 
  </body>
</html>