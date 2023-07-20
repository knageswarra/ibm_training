<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student registration form here</title>
</head>
<body>
<%if(request.getAttribute("errors")!=null)
{
out.println("<font color='red'>"+request.getAttribute("errors")+"</font>");
}
%>
<h3>student registration form</h3>
<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
		Roll no: <form:input path="rollno" />
		<br>
		<br>
	    Country:<form:select path="country">

        <form:option value="Brazil" label="Brazil" />

        <form:option value="France" label="France" />

        <form:option value="Germany" label="Germany" />

        <form:option value="India" label="India" />
        </form:select>
		<input type="submit" value="Submit" />
	
	</form:form>

</body>
</html>