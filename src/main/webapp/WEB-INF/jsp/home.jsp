<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>EMS</title>

	
</head>
<body style="align-content: center;">
	<h1 align="center">SERVICES</h1>
	<br>
	
	<p style="text-align: right;"> 
	<a href="/logout" >Logout</a>
	<a href="/doc" >Documentation</a>
	</p>
	<div align="center" class="container pt-3" >

		<div class="row">
			<div class="card" style="width: 14rem;" align="left">
				<img
					src="https://cdn2.iconfinder.com/data/icons/business-and-finance-glyph-22/64/business-and-finance-glyph-22-14-512.png"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">Add Employee</h5>
					<p class="card-text">Quickly Add a new Employee in Database
						graphically.</p>
					<a href="/addnew" class="btn btn-primary">Add New Employee</a>
				</div>
				&nbsp;&nbsp;&nbsp;&nbsp;
			</div>

			<div class="card" style="width: 14rem;" align="left">
				<img src="https://static.thenounproject.com/png/438808-200.png"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">Delete Employee</h5>
					<p class="card-text">Quickly Delete a Employee in Database
						graphically.</p>
					<a href="/delete" class="btn btn-primary">Delete Employee</a>
				</div>
			</div>
			&nbsp;&nbsp;&nbsp;&nbsp;

			<div class="card" style="width: 14rem;" align="left">
				<img
					src="https://www.pngfind.com/pngs/m/378-3782102_group-of-employees-icon-hd-png-download.png"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">Count Employee</h5>
					<p class="card-text">Quickly Check Total number of employees in
						DATABASE</p>
					<a href="/count" class="btn btn-primary">COUNT</a>
				</div>
			</div>
		</div>
	</div>
	<br>
	<div align="center" class="container pt-3">

		<div class="row">
	<div class="card" style="width: 14rem;" align="left">
		<img
			src="https://i.pinimg.com/originals/0c/99/8d/0c998d310047de4f79c4da49f29cb265.jpg"
			class="card-img-top" alt="...">
		<div class="card-body">
			<h5 class="card-title">CHANGE DEPARTMENT</h5>
			<p class="card-text">Assign a new Department to an Employee</p>
			<a href="/getdept" class="btn btn-primary">CHANGE</a>
		</div>
		</div>
		&nbsp;&nbsp;&nbsp;&nbsp;
		
		
			<div class="card" style="width: 14rem;" align="left">
		<img
			src="https://png.pngtree.com/png-vector/20190429/ourmid/pngtree-employee-icon-vector-illustration-in-glyph-style-for-any-purpose-png-image_998315.jpg"
			class="card-img-top" alt="...">
		<div class="card-body">
			<h5 class="card-title">SHOW ALL</h5>
			<p class="card-text">Display All the employees from DATABASE</p>
			<a href="/showall" class="btn btn-primary">SHOW ALL</a>
		</div>
		</div>
		&nbsp;&nbsp;&nbsp;&nbsp;
		
			<div class="card" style="width: 14rem;" align="left">
		<img
			src="https://cdn0.iconfinder.com/data/icons/user-icon-profile-businessman-finance-vector-illus/100/06-1User-512.png"
			class="card-img-top" alt="...">
		<div class="card-body">
			<h5 class="card-title">EDIT EMPLOYEE</h5>
			<p class="card-text">Update the details employees</p>
			<a href="/edit" class="btn btn-primary">EDIT</a>
		</div>
		</div>
		
		</div>
		</div>
</body>
</html>