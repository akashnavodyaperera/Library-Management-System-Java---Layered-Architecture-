    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Dao.Custom.Impl;

import java.util.ArrayList;
import lms.Dao.CrudUtil;
import lms.Dao.Custom.BookDao;
import lms.Entity.BookEntity;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class BookDaoImpl implements BookDao {

    @Override
    public boolean create(BookEntity t) throws Exception {
    return CrudUtil.executeUpdate("INSERT INTO book VALUES(?,?,?,?,?)",t.getBookID(), t.getBookName(), t.getAurthor(), t.getCategoryID(), t.getIsbn());   
    }

    @Override
    public boolean update(BookEntity t) throws Exception {
    return CrudUtil.executeUpdate("UPDATE book SET Book_Name=?, Author=?, Category_ID=?,  ISBN=?  WHERE Book_ID =?", t.getBookID(), t.getBookName(), t.getAurthor(), t.getCategoryID(), t.getIsbn()); 
    }

    @Override
    public boolean delete(String id) throws Exception {
    return CrudUtil.executeUpdate("DELETE FROM book WHERE Book_ID = ?", id);
    }

    @Override
    public BookEntity get(String id) throws Exception {
    ResultSet rst = CrudUtil.executeQuery("SELECT * FROM book WHERE Book_ID = ?", id); 
        if (rst.next()) {
            BookEntity entity = new BookEntity(rst.getString("Book_ID"), rst.getString("Book_Name"), rst.getString("Author"), rst.getString("Category_ID"), rst.getString("ISBN"));
            return entity;
        }
        return null;  
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
    ArrayList<BookEntity> bookEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM book");
        
        while (rst.next()) {
            BookEntity entity = new BookEntity(rst.getString("Book_ID"), rst.getString("Book_Name"), rst.getString("Author"), rst.getString("Category_ID"), rst.getString("ISBN"));
            bookEntities.add(entity);
        }
        return bookEntities;
    }    
    
}






