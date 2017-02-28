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
        <h1>Example of the insert data using structs application</h1>
        eid<input type="number" name="eid" ><br>
        fname<input type="text" name="fname"><br>   
        lname<input type="text" name="lname"><br>
        bsal<input type="number" name="b_sal"><br>
        <br><input type="submit" value="Update"><br>
        <h2><%out.println(request.getAttribute("msg"));%></h2>
         </form>
    </body>
</html>
