/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lms.Service.Custom;

import java.util.ArrayList;
import lms.Dto.CategoryDto;
import lms.Service.SuperService;

/**
 *
 * @author ASUS
 */
public interface CategoryService extends SuperService {
    String save(CategoryDto categoryDto) throws Exception;
    String update(CategoryDto categoryDto) throws Exception;
    String delete(String categoryID) throws Exception;
    CategoryDto getCategory(String categoryID) throws Exception;
    ArrayList<CategoryDto> getAll() throws Exception;
}
