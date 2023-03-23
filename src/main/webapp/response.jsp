<%@page import="com.model.crud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import=" java.util.ArrayList"%>
<%@ page import=" java.util.Arrays"%>
<%@page import="com.model.fetchData"%>
<%@page import="com.model.Student_pojo"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration</title>
<link rel="stylesheet" href="reg2.css">
</head>

<body>
	<header>
		<div class="navbar">
			<ul>
				<li class="button"><a
					href="http://localhost:8484/FirstMavenWebapp/index.jsp">Register
						Student</a></li>
				<li class="button"><a
					href="http://localhost:8484/FirstMavenWebapp/response.jsp">Student
						Record</a></li>

			</ul>
		</div>
	</header>
	<h1 style="text-align: center;">Registration form using
		Maven-Hibernate</h1>
	<section>
		<div class="data">
			<h2>Student Record</h2>

			<table>
				<thead>
					<tr>
						<th>Sr.</th>
						<th>Student Name</th>
						<th>Father Name</th>
						<th>Mother Name</th>
						<th>Gender</th>
						<th>DOB</th>
						<th>Update</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<%
					ArrayList<Student_pojo> list = fetchData.fetchData();
					for (Student_pojo student : list) {
					%>
					<tr>
						<%
						int id = student.getId();
						%>
						<td><%=id%></td>
						<td><%=student.getStudent_Name()%></td>
						<td><%=student.getFather_Name()%></td>
						<td><%=student.getMother_Name()%></td>
						<td><%=student.getGender()%></td>
						<td style="font-size: 15px;"><strong><%=student.getDOB()%></strong></td>


						<form action="curd" method="post">
							<input type="hidden" name="id" value=<%=id%>>
							<td><button type="submit" name="button" value="update">Update</button></td>
							<td><button type="submit" name="button" value="delete">Delete</button></td>
							
						</form>
					</tr>

					<%
					}
					%>
				</tbody>

			</table>

		</div>

	</section>
	<footer></footer>
</body>

</html>

