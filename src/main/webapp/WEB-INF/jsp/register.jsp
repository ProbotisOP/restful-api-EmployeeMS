<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>REGISTRATION</title>
</head>
<body>
<center>
<h1 style="align-content: center;"> REGISTRATION FORM</h1>
	<form action="/register" method="post">
	
	 <div class="form-row">
    <div class="form-group col-md-6">
      <label for="fname">ID</label>
      <input type="number" class="form-control" name="id" placeholder="ID" min="1" maxlength="5" required="required">
    </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="fname">First Name</label>
      <input type="text" class="form-control" name="fname" placeholder="first name" required="required">
    </div>
    <div class="form-group col-md-6">
      <label for="lname">Last name</label>
      <input type="text" class="form-control" name="lname" placeholder="Last name" required="required">
    </div>
  </div>
   </div>
    <div class="form-group col-md-6">
      <label for="lname">Department</label>
      <input type="text" class="form-control" name="dept" placeholder="department" required="required">
    </div>
  </div>
    <div class="form-group col-md-6">
      <label for="salary">Salary</label>
      <input type="int" class="form-control" name="salary" placeholder="Salary" required="required">
    </div>
    <br>

  <button type="submit" class="btn btn-primary">Register</button>
</form>
</center>
</body>
</html>