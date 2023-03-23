
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.model.Student_pojo"%>
<%@ page import="com.model.fetchData"%>
<%@ page import=" java.util.ArrayList"%>
<%@ page import=" java.util.Arrays"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration</title>
<link rel="stylesheet" href="reg.css">
</head>

<body>
	<header>
		<div class="navbar">
			<ul>
				<li class="button"><a
					href="http://localhost:8484/FirstMavenWebapp/index.jsp">Register
						Student</a></li>
				<li class="button" target="_blank"><a
					href="http://localhost:8484/FirstMavenWebapp/response.jsp">Student
						Record</a></li>
						
			</ul>
		</div>
	</header>
	<h1 style="text-align: center;">Registration form using
		Maven-Hibernate</h1>
	<section>

		<div class="search">
			<h2>Search Student</h2>
			<br>
			<form action="FrontController" method="get" target="_blank">
				<input type="text" name="name" placeholder="Search Student By">

				<select name="search">
					<option value="id">Id</option>
					<option value="Student_Name">Student Name</option>
					<option value="Mother_Name">Mother name</option>
					<option value="Father_Name">Father Name</option>
					<option value="DOB">DOB</option>
					<option value="Gender">Gender</option>
				</select>
				<button type="submit" name="button" value="search">Search Student</button>
			</form>


		</div>

		<div class="form">
			<h2>Registration form</h2>
			<form action="FrontController" method="post">
				Student Name : <input type="text" name="Studentname"
					placeholder="Student name"><br> Father Name : <input
					type="text" name="Fathername" placeholder="Father name"><br>
				Mother Name : <input type="text" name="Mothername"
					placeholder="Mother name"><br> Gender : Male<input
					type="radio" name="Gender" value="Male"> Female<input
					type="radio" name="Gender" value="Female"><br> DOB : <input
					type="date" name="DOB"><br>
				<button type="submit" name="button" value="register">Register</button>
			</form>

		</div>

	</section>
	<footer></footer>
</body>

</html>

