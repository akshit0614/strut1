<%-- 
    Document   : delete
    Created on : 28 Feb, 2017, 12:39:20 PM
    Author     : mca1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <form action="del.do" method="post">
        <h1>Example of the Delete data using structs application</h1>
        Emp ID<input type="number" name="eid" ><br>
       
        <br><input type="submit" value="delete"><br>
        <h2><%out.println(request.getAttribute("msg"));%></h2>
         </form>
    </center>
    </body>
</html>
