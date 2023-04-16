<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
	<!-- <form action="calc" method="post">
		First Number:<input type="number" name="tbFn">
		<br/>	
		Second Number:<input type="number" name="tbSn">
		<br/>	
		<input type="submit" name="btnAdd" value="add">
		
		<input type="submit" name="btnSub" value="sub">
		
		<input type="submit" name="btnMul" value="mul">
		
		<input type="submit" name="btnDiv" value="div">
			
	</form> -->
	
	<center>
	<form action="calc" method="post">
	<h1 style="background-color:blue;text:white" >BASIC CALCULATOR</h1>
            <Table>
                <tr>
                    <td> First Number:</td>
                    <td> <input type="number" name="tbFn" /></td><br>
                </tr>
                <tr>
                    <td> Second Number:</td>
                    <td> <input type="number" name="tbSn" /></td><br>
                </tr>
            </Table>
            <button type="submit" class="btn btn-primary" name="btnAdd" >Add</button>
            <button type="submit" class="btn btn-secondary" name="btnSub">Sub</button>
            <button type="submit" class="btn btn-success" name="btnMul">Mul</button>
            <button type="submit" class="btn btn-danger" name="btndiv">Divide</button>


        </form>
        </center>
</body>
</html>