<%-- 
    Document   : ageCalculator
    Created on : Sep 18, 2017, 8:13:09 AM
    Author     : 727334
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Week 02 Lab 1</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Age Next Birthday</h1>
        <div>
            <form action="ageCalculator" method="GET">
                Enter your current age: <input type="text" name="age" ><input type="submit" Value="Age Next Birthday">
            </form>
        </div>
        ${errorMessage}
        ${age}
        
           
    </body>
</html>