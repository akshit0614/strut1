<%-- 
    Document   : error
    Created on : 28 Feb, 2017, 12:03:34 PM
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
         <%out.println(request.getAttribute("errmsg"));%>
    </body>
</html>
