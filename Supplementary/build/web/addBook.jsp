
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Book</title>
    </head>
        <body>
        <div>
            <h1>Add New Book </h1>
                <form method="post" action="AddBookServlet">
                    <div class="form-group col">
                        <label for="bookID">Book ID</label> 
                        <input name="bookID" type="text" class="form-control" placeholder="Enter book id...">
                    </div>
                    <div class="form-group col">
                        <label for="title">Title</label> 
                        <input name="title" type="text" class="form-control" placeholder="Enter title...">
                    </div>
                    <div class="form-group col">
                        <label for="author">Author</label> 
                        <input name="author" type="text" class="form-control" placeholder="Enter author...">
                    </div>
                    <div class="form-group col">
                        <label for="publisher">Publisher</label> 
                        <input name="publisher" type="text" class="form-control" placeholder="Enter publisher...">
                    </div>
                   <div class="form-group col">
                        <button class="btn btn-primary btn-lg btn-block" type="submit">Register</button>                
                    </div>
                </form>           
        </div>
    </body>
</html>