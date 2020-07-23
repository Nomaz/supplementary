/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Book implements Serializable {
    private int bookID;
    private String title;
    private String author;
    private String publisher;

    public Book(int bookID, String title, String author, String publisher) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
    
}