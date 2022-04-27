<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">

<center>
<h1 style="align-content: center;">DELETE EMPLOYEE</h1>
	<form action="/deletebyid" method="post">
	
	 <div class="form-row">
    <div class="form-group col-md-6">
      <label for="fname">ID</label>
      <input type="number" class="form-control" name="id" placeholder="ID" min="1" maxlength="5" required="required">
    </div>
    
    <button type="submit" class="btn btn-danger">DELETE</button>

</body>
</html>