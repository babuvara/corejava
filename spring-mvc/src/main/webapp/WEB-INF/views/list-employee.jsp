<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Employee Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>E mail</th>
					<th>Hire date</th>
					<th>Job Id</th>
					<th>Salary</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="customer" items="${allemployee}">
					<tr>
						<td>${customer.emp_ID}</td>
						<td>${customer.first_name}</td>
						<td>${customer.last_name}</td>
						<td>${customer.email}</td>
						<td>${customer.hire_date}</td>
						<td>${customer.job_id}</td>
						<td>${customer.salary}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>