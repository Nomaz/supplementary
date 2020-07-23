/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import uts.isd.model.Book;

public class BookDAO {
    private Statement st;
    private Connection conn;
    
    public BookDAO (Connection conn) throws SQLException {
        st = conn.createStatement();
        this.conn = conn;
    }
    
    public void addBook(int bookID, String title, String author, String publisher) throws SQLException {
        String query = "INSERT INTO book.BOOK(BOOKID, TITLE, AUTHOR, PUBLISHER) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, bookID);
            pstmt.setString(2, title);
            pstmt.setString(3, author);
            pstmt.setString(4, publisher);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
    
    