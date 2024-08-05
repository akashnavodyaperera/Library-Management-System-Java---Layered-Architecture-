/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Entity;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class BorrowReturnEntity {
    
    private String borrowId;
    private String bookId;
    private String memberId;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;
    private Double fine; 

    public BorrowReturnEntity() {
    }

   

    public BorrowReturnEntity(String borrowId, String bookId, String memberId, Date borrowDate, Date dueDate, Date returnDate, Double fine) {
        this.borrowId = borrowId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    /**
     * @return the borrowId
     */
    public String getBorrowId() {
        return borrowId;
    }

    /**
     * @param borrowId the borrowId to set
     */
    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * @return the borrowDate
     */
    public Date getBorrowDate() {
        return borrowDate;
    }

    /**
     * @param borrowDate the borrowDate to set
     */
    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    /**
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the returnDate
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * @return the fine
     */
    public Double getFine() {
        return fine;
    }

    /**
     * @param fine the fine to set
     */
    public void setFine(Double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "BorrowReturnEntity{" + "borrowId=" + borrowId + ", bookId=" + bookId + ", memberId=" + memberId + ", borrowDate=" + borrowDate + ", dueDate=" + dueDate + ", returnDate=" + returnDate + ", fine=" + fine + '}';
    }
    
    
}
