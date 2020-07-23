
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <h1>Book Keeping</h1>
        <a href="AddBookServlet">Add Book</a>
        <jsp:include page="/ConnServlet" flush="true" />
    </body>
</html>
