<%-- 
    Document   : ageCalculator
    Created on : Sep 18, 2017, 1:02:36 PM
    Author     : 738377
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age next birthday</h1>
        <div>
            <form action="ageCalculator" method="GET">
                Enter your current age: <input type="text" name="age" value="${age}">
                <input type="submit" value="Age next birthday">
            </form>
        </div>
             ${errorMessage}
             ${success}
    </body>
</html>
