
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="CSS/lab03.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculators</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method="post" action="age">
            
            <label> Enter your age: </label>
            <input type="text" name="age" value="">
            <br>
            <br>
            <input type="submit" value="Age next birthday">
            <p>${nextAge} ${age}</p>
            <p>${message}</p>
            <a href="arithmetic">Arithmetic Calculator</a>
     
        </form>
    </body>
</html>
