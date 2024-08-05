/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Controller;

import java.util.ArrayList;
import lms.Dto.BorrowReturnDto;
import lms.Service.Custom.BorrowReturnService;
import lms.Service.ServiceFactory;

/**
 *
 * @author ASUS
 */
public class BorrowReturnController {
    
    private BorrowReturnService borrowreturnService = (BorrowReturnService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BORROWRETURN);
    
    public String save(BorrowReturnDto borrowreturndto)throws Exception{
        return borrowreturnService.save(borrowreturndto); 
    }
    
    public String update(BorrowReturnDto borrowreturndto)throws Exception{
        return borrowreturnService.update(borrowreturndto); 
    }
    
    public String delete(String borrowreturnID)throws Exception{
        return borrowreturnService.delete(borrowreturnID); 
    }
    
     public ArrayList<BorrowReturnDto> getAll()throws Exception{
        return borrowreturnService.getAll(); 
    }
     
     public BorrowReturnDto get(String borrowId)throws Exception{
        return borrowreturnService.get(borrowId); 
    }
    
}
