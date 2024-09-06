/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFrame;

/**
 *
 * @author Shehan
 */
public class Books {
    private int BookID;
     private String Bookname;
    private String author;
    private String date;
    private int quantity;
    
    public int getBookID(){
        return BookID;
    }
    
    public void setBookID (int BookID){
        this.BookID = BookID;
    }
    
    public String getBookName() {
        return Bookname;
    }

    public void setBookName(String name) {
        this.Bookname = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
