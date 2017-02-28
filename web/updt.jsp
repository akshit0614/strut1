<%-- 
    Document   : updt
    Created on : 28 Feb, 2017, 12:23:41 PM
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
         <form action="upd.do" method="post">
        <center>
        <h1>Example of the Update data using structs application</h1>
        <table>
            <tr><td>Emp ID</td><td>
                    <input type="number" name="eid" ></td></tr>
            <tr><td>First Name</td><td><input type="text" name="fname"></td></tr>   
            <tr><td>Last Name</td><td><input type="text" name="lname"></td></tr>
            <tr><td>Basic Salary</td><td> <input type="number" name="b_sal"></td></tr>
        </table>
        <br><input type="submit" value="submit"><br>
        
        <h2><%out.println(request.getAttribute("msg"));%></h2>
        </center>
    </form>
    </body>
</html>
