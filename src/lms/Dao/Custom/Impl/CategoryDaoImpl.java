/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Dao.Custom.Impl;

import java.util.ArrayList;
import lms.Dao.CrudUtil;
import lms.Dao.Custom.CategoryDao;
import lms.Entity.CategoryEntity;
import java.sql.ResultSet;
/**
 *
 * @author ASUS
 */
public class CategoryDaoImpl implements CategoryDao {

    @Override
    public boolean create(CategoryEntity t) throws Exception {
    return CrudUtil.executeUpdate("INSERT INTO category VALUES(?,?)",t.getCategoryID(), t.getCategoryName());
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
    return CrudUtil.executeUpdate("UPDATE category SET Category_Name=? WHERE Category_ID =?", t.getCategoryName(), t.getCategoryID());
    }

    @Override
    public boolean delete(String id) throws Exception {
    return CrudUtil.executeUpdate("DELETE FROM category WHERE Category_ID = ?", id);
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
    ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category WHERE Category_ID = ?", id); 
        if (rst.next()) {
            CategoryEntity entity = new CategoryEntity(rst.getString("Category_ID"), rst.getString("Category_Name"));
            return entity;
        }
        return null;
}

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
        ArrayList<CategoryEntity> categoryEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category");
        
        while (rst.next()) {
            CategoryEntity entity = new CategoryEntity(rst.getString("Category_ID"), rst.getString("Category_Name"));
            categoryEntities.add(entity);
        }
        return categoryEntities;
    }
}





