/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Dao.Custom.Impl;

import java.util.ArrayList;
import lms.Dao.CrudUtil;
import lms.Dao.Custom.BorrowReturnDao;
import lms.Entity.BorrowReturnEntity;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class BorrowReturnDaoImpl implements BorrowReturnDao {

    @Override
    public boolean create(BorrowReturnEntity t) throws Exception {
    return CrudUtil.executeUpdate("INSERT INTO borrow VALUES(?,?,?,?,?,?,?)",t.getBorrowId(), t.getBookId(), t.getMemberId(), t.getBorrowDate(), t.getDueDate(), t.getReturnDate(), t.getFine());   
    }

    @Override
    public boolean update(BorrowReturnEntity t) throws Exception {
    return CrudUtil.executeUpdate("UPDATE borrow SET Book_ID=?, Member_ID=?, Borrow_Date=?,  Due_Date=?, Return_Date=?, Fine=?  WHERE Borrow_ID =?", t.getBookId(), t.getMemberId(), t.getBorrowDate(), t.getDueDate(), t.getReturnDate(), t.getFine(), t.getBorrowId()); 
    }

    @Override
    public boolean delete(String id) throws Exception {
    return CrudUtil.executeUpdate("DELETE FROM borrow WHERE Borrow_ID = ?", id);    
    }

    @Override
    public BorrowReturnEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM borrow WHERE Borrow_ID = ?", id); 
        
        if (rst.next()) {
            BorrowReturnEntity entity = new BorrowReturnEntity(rst.getString("Borrow_ID"),
                    rst.getString("Book_ID"),
                    rst.getString("Member_ID"),
                    rst.getDate("Borrow_Date"),
                    rst.getDate("Due_Date"),
                    rst.getDate("Return_Date"),
                    rst.getDouble("Fine"));
            return entity;
        }
        return null;      }

    @Override
    public ArrayList<BorrowReturnEntity> getAll() throws Exception {
        ArrayList<BorrowReturnEntity> borrowreturnEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM borrow");
        
        while (rst.next()) {
            BorrowReturnEntity entity = new BorrowReturnEntity (rst.getString("Borrow_ID"),
                    rst.getString("Book_ID"),
                    rst.getString("Member_ID"),
                    rst.getDate("Borrow_Date"),
                    rst.getDate("Due_Date"),
                    rst.getDate("Return_Date"),
                    rst.getDouble("Fine"));

            borrowreturnEntities.add(entity);
        }
        return borrowreturnEntities;    }
    
}
