/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Controller;

import java.util.ArrayList;
import lms.Dto.BookDto;
import lms.Service.Custom.BookService;
import lms.Service.ServiceFactory;

/**
 *
 * @author ASUS
 */
public class BookController {
    
    private BookService bookService = (BookService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK);
    
    public String save(BookDto bookdto)throws Exception{
        return bookService.save(bookdto); 
    }
    
    public String update(BookDto bookdto)throws Exception{
        return bookService.update(bookdto); 
    }
    
    public String delete(String bookID)throws Exception{
        return bookService.delete(bookID); 
    }
    
    public ArrayList<BookDto> getAll()throws Exception{
        return bookService.getAll(); 
    }
    
    public BookDto get(String bookID)throws Exception{
        return bookService.getBook(bookID); 
    }
}



