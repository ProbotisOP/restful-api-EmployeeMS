<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<title>Employee List </title>
</head>
<body>
    
  
    <br>
    <form action="/update" method="post">
	
	 <div class="form-row">
    <div class="form-group col-md-6">
      
      <input type="hidden" class="form-control" name="id" value="${emp2edit.id}" min="1" maxlength="5">
    </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="fname">First Name</label>
      <input type="text" class="form-control" name="fname" value="${emp2edit.firstname}"  required="required">
    </div>
    <div class="form-group col-md-6">
      <label for="lname">Last name</label>
      <input type="text" class="form-control" name="lname" value="${emp2edit.lastname}"  firstnamerequired="required">
    </div>
  </div>
   </div>
    <div class="form-group col-md-6">
      <label for="lname">Department</label>
      <input type="text" class="form-control" name="dept" value="${emp2edit.department}" required="required">
    </div>
  </div>
    <div class="form-group col-md-6">
      <label for="salary">Salary</label>
      <input type="int" class="form-control" name="salary" value="${emp2edit.salary}" required="required">
    </div>
    <br>

  <button type="submit" class="btn btn-primary">UPDATE</button>
</form>
    
</body>
</html>