/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lms.Service.Custom;

import java.util.ArrayList;
import lms.Dto.BookDto;
import lms.Service.SuperService;

/**
 *
 * @author ASUS
 */
public interface BookService extends SuperService {
    String save(BookDto bookdto) throws Exception;
    String update(BookDto bookdto) throws Exception;
    String delete(String bookID) throws Exception;
    BookDto getBook(String bookID) throws Exception;
    ArrayList<BookDto> getAll() throws Exception;
}






