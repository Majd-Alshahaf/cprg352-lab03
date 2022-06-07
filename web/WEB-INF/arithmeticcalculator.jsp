

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="CSS/lab03.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic_Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First</label>
            <input type="text" name="firstNum" value="${firstVal}" class="names">
            <br>
            <label>Second</label>
            <input type="text" name="secondNum" value="${secondVal}" class="names">
            <br>
            <br>
            <input type="submit" name="operations" value="+" class="operations">
            <input type="submit" name="operations" value="-" class="operations">
            <input type="submit" name="operations" value="*" class="operations">
            <input type="submit" name="operations" value="%" class="operations">
            
            <br>
            <br>
            <p>Result: ${total} ${message}</p>
         
            <a href="age">Age Calculator</a>
            
            
            
            
            
            
            
        
        
        
        
        
        
        </form>
    </body>
</html>
