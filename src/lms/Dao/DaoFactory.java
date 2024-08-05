/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Dao;

import lms.Dao.Custom.Impl.BookDaoImpl;
import lms.Dao.Custom.Impl.BorrowReturnDaoImpl;
import lms.Dao.Custom.Impl.CategoryDaoImpl;
import lms.Dao.Custom.Impl.MemberDaoImpl;

/**
 *
 * @author ASUS
 */
public class DaoFactory {
    
    private static  DaoFactory daoFactory;

    public DaoFactory() {}
    
  public static DaoFactory getInstance(){
      if(daoFactory == null){
         daoFactory = new DaoFactory();
      }
      return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case CATEGORY:
                return new CategoryDaoImpl();
                
            case BOOK:
                return new BookDaoImpl();
                
            case MEMBER:
                return new MemberDaoImpl();
                
            case BORROWRETURN:
                return new BorrowReturnDaoImpl();
            default:
                return null;
        }
    }
    
    public enum DaoTypes{
        CATEGORY,BOOK,MEMBER,BORROWRETURN;
    }
}
