
package uts.isd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uts.isd.model.*;
import uts.isd.model.dao.*;

public class AddBookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.getRequestDispatcher("addBook.jsp").include(request, response);
    } 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
        HttpSession session = request.getSession();         
        int bookID = Integer.parseInt(request.getParameter("bookID"));
        String title = request.getParameter("title").trim();
        String author = request.getParameter("author").trim();
        String publisher = request.getParameter("publisher").trim();
        BookDAO bookDAO = (BookDAO) session.getAttribute("bookDAO");
        
        try {
              bookDAO.addBook(bookID, title, author, publisher);
              request.getRequestDispatcher("index.jsp").include(request, response);                
              } catch (SQLException ex) {
                request.getRequestDispatcher("addBook.jsp").include(request, response);
              }                
        }
    }
