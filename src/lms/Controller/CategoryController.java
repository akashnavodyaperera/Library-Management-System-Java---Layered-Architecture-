/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Controller;

import java.util.ArrayList;
import lms.Dto.CategoryDto;
import lms.Service.Custom.CategoryService;
import lms.Service.ServiceFactory;

/**
 *
 * @author ASUS
 */
public class CategoryController {
    
    private CategoryService categoryService = (CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);
    
    public String save(CategoryDto categorydto)throws Exception{
        return categoryService.save(categorydto); 
    }
    
    public String update(CategoryDto categorydto)throws Exception{
        return categoryService.update(categorydto); 
    }
    
    public String delete(String categoryID)throws Exception{
        return categoryService.delete(categoryID);
    }
    
    public ArrayList<CategoryDto> getAll()throws Exception{
        return categoryService.getAll(); 
    }
    
    public CategoryDto getCategory(String categoryID)throws Exception{
        return categoryService.getCategory(categoryID); 
    }
}
