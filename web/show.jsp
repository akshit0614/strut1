    <%@page import="java.sql.*"%>
    <%@page contentType="text/html"%>
    <%@page pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
    <title>Update</title>
    <body>
        <br>
            <center>
        <h1>Form to Fetch Employee Data</h1>

        <form action="sh.do"  method="post">
            <input type="submit" value="Fetch All Records">
            <br><br>



            <%   
                out.println(request.getAttribute("msg"));
            %>

        </form>
            </center>
    </body>
    </html>