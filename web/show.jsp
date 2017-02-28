<%-- 
    Document   : show
    Created on : 28 Feb, 2017, 12:46:58 PM
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
        <form action="del.do" method="post">
        <h1>Example of the insert data using structs application</h1>
       
       
        <br><input type="submit" value="Show"><br>
        <h2><%out.println(request.getAttribute("msg"));%></h2>
         </form>
    </body>
</html>
