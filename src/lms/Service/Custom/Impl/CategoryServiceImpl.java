/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Service.Custom.Impl;

import java.util.ArrayList;
import lms.Dao.Custom.CategoryDao;
import lms.Dao.DaoFactory;
import lms.Dto.CategoryDto;
import lms.Entity.CategoryEntity;
import lms.Service.Custom.CategoryService;



/**
 *
 * @author ASUS
 */
public class CategoryServiceImpl implements CategoryService {
    
    private CategoryDao categoryDao = (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);

    @Override
    public String save(CategoryDto categoryDto) throws Exception {
        CategoryEntity entity =  getCategoryEntity(categoryDto);
        return categoryDao.create(entity)? "Sucess":"Fail";
    }

    @Override
    public String update(CategoryDto categoryDto) throws Exception {
        CategoryEntity entity =  getCategoryEntity(categoryDto);
        return categoryDao.update(entity)? "Sucess":"Fail";
    }

    @Override
    public String delete(String categoryID) throws Exception {
        return categoryDao.delete(categoryID)? "Sucess":"Fail";
    }

    @Override
    public CategoryDto getCategory(String categoryID) throws Exception {
        CategoryEntity entity = categoryDao.get(categoryID);
        if (entity != null) {
            return getCategoryDto(entity);            
        }
        return null;
    }

     @Override
    public ArrayList<CategoryDto> getAll() throws Exception {
        ArrayList<CategoryEntity> categoryEntities = categoryDao.getAll();
        ArrayList<CategoryDto> categoryDtos = new ArrayList<>();

        if (categoryEntities != null) {
            for (CategoryEntity categoryEntity : categoryEntities) {
                categoryDtos.add(getCategoryDto(categoryEntity));
            }
        }

        return categoryDtos;
    }
    
    private CategoryEntity getCategoryEntity(CategoryDto categoryDto){
        return new CategoryEntity(categoryDto.getCategoryID(),
                categoryDto.getCategoryName());
    }

     private CategoryDto getCategoryDto(CategoryEntity entity){
        return new  CategoryDto(entity.getCategoryID(), entity.getCategoryName());
    }
    
   
}





