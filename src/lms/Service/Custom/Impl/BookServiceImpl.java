/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Service.Custom.Impl;

import java.util.ArrayList;
import lms.Dao.Custom.BookDao;
import lms.Dao.DaoFactory;
import lms.Dto.BookDto;
import lms.Entity.BookEntity;
import lms.Service.Custom.BookService;

/**
 *
 * @author ASUS
 */
public class BookServiceImpl implements BookService {
    
    private BookDao bookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);
    
     @Override
    public String save(BookDto bookdto) throws Exception {
    BookEntity entity =  getBookEntity(bookdto);
    return bookDao.create(entity)? "Sucess":"Fail";        
    }

    @Override
    public String update(BookDto bookdto) throws Exception {
    BookEntity entity =  getBookEntity(bookdto);
    return bookDao.update(entity)? "Sucess":"Fail"; 
    }    
    

    @Override
    public String delete(String bookID) throws Exception {
    return bookDao.delete(bookID)? "Sucess":"Fail";   
    }

    @Override
    public BookDto getBook(String bookID) throws Exception {
    BookEntity entity = bookDao.get(bookID);
        if (entity != null) {
            return getBookDto(entity);            
        }
        return null;    
    }

    @Override
     public ArrayList<BookDto> getAll() throws Exception {
        ArrayList<BookEntity> bookEntities = bookDao.getAll();
        ArrayList<BookDto> bookDtos = new ArrayList<>();
        if (bookEntities != null) {
            for (BookEntity bookEntity : bookEntities) {
                bookDtos.add(getBookDto(bookEntity));
            }
        }
        return bookDtos;
    }
   
    private BookEntity getBookEntity(BookDto bookDto){
        return new BookEntity(bookDto.getBookID(),
                bookDto.getBookName(), bookDto.getAurthor(), bookDto.getCategoryID(), bookDto.getIsbn());
    }

    private BookDto getBookDto (BookEntity entity){
        return new BookDto(entity.getBookID(), entity.getBookName(), entity.getAurthor(), entity.getCategoryID(), entity.getIsbn());
    }
    
    }









