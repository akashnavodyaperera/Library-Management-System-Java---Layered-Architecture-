/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Service;

import lms.Service.Custom.Impl.BookServiceImpl;
import lms.Service.Custom.Impl.BorrowReturnServiceImpl;
import lms.Service.Custom.Impl.CategoryServiceImpl;
import lms.Service.Custom.Impl.MemberServiceImpl;

/**
 *
 * @author ASUS
 */
public class ServiceFactory {
 
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }
    
    public static ServiceFactory getInstance(){
        if (serviceFactory==null) {
            serviceFactory= new ServiceFactory();
        }
        return serviceFactory;
}
    
    
    public SuperService getService(ServiceType serviceType){
        switch (serviceType) {
            case CATEGORY:
                return new CategoryServiceImpl();
                
            case BOOK:
                return new BookServiceImpl();
                
            case MEMBER:
                return new MemberServiceImpl();
                
            case BORROWRETURN:
                return new BorrowReturnServiceImpl();
                
            default:
                return null;
        }
    }
    
    
    public enum ServiceType{
        CATEGORY,BOOK,MEMBER,BORROWRETURN
    }
}




