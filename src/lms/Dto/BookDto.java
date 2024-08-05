/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Dto;

/**
 *
 * @author ASUS
 */
public class BookDto {
    
    private String bookID;
    private String bookName;
    private String aurthor;
    private String categoryID;
    private String isbn;

    public BookDto() {
    }



    public BookDto(String bookID, String bookName, String aurthor, String categoryID, String isbn) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.aurthor = aurthor;
        this.categoryID = categoryID;
        this.isbn = isbn;
    }



    /**
     * @return the bookID
     */
    public String getBookID() {
        return bookID;
    }

    /**
     * @param bookID the bookID to set
     */
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    /**
     * @return the bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName the bookName to set
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * @return the aurthor
     */
    public String getAurthor() {
        return aurthor;
    }

    /**
     * @param aurthor the aurthor to set
     */
    public void setAurthor(String aurthor) {
        this.aurthor = aurthor;
    }

    /**
     * @return the categoryID
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * @param categoryID the categoryID to set
     */
    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "BookDto{" + "bookID=" + bookID + ", bookName=" + bookName + ", aurthor=" + aurthor + ", categoryID=" + categoryID + ", isbn=" + isbn + '}';
    }

   
    
}







