<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
		<h1>ADD EMPLOYEE</h1>
	</p>
	<hr/>
	<% List<String> errors=(List<String>)request.getAttribute("ERRORS");
	   if(errors!=null)
	   {
		   for(String str:errors)
				out.println("<font color='red'>"+str+"</font><br/>");
	   }
	%>
	<form action="addEmployee" method="post">
		<table>

			<tr>

				<td>Name</td>
				<td><input type="text" name="t1"></td>
			</tr>
			<tr>

				<td>Age</td>
				<td><input type="text" name="t2"></td>

			</tr>
			<tr>
				<td><input type="submit" value="Add Employee"></td>

			</tr>
		</table>

	</form>
</body>
</html>