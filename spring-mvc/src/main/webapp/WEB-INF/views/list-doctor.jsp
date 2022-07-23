<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor List</title>
</head>
<body style="background-color: powderblue;">
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Doctor id</th>
					<th>Doctor Name</th>
					<th>DOB</th>
					<th>Speciality</th>
					<th>City</th>
					<th>Phone No</th>
					<th>standard_fees</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="doct" items="${alldoctor}">
					<tr>
						<td>${doct.doctor_id}</td>
						<td>${doct.doctor_name}</td>
						<td>${doct.dob}</td>
						<td>${doct.speciality}</td>
						<td>${doct.city}</td>
						<td>${doct.phone_no}</td>
						<td>${doct.standard_fees}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>