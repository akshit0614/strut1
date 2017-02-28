%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<body>
    <form action="NewStrutsAction.do" method="post">
        <h1>Example of the insert data using structs application</h1>
      <input type="number" name="eid" ><br>
        <input type="text" name="fname"><br>   
        <input type="text" name="lname"><br>
        <input type="number" name="b_sal"><br>
        <br><input type="submit" value="submit"><br>
        <h2><%out.println(request.getAttribute("msg"));%></h2>
    </form>
</body>