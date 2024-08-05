/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lms.Service.Custom;

import java.util.ArrayList;
import lms.Dto.BorrowReturnDto;
import lms.Service.SuperService;

/**
 *
 * @author ASUS
 */
public interface BorrowReturnService extends SuperService {
    
    String save(BorrowReturnDto borrowreturndto) throws Exception;
    String update(BorrowReturnDto borrowreturndto) throws Exception;
    String delete(String borrowreturnID) throws Exception;
    BorrowReturnDto get(String bookID) throws Exception;
    ArrayList<BorrowReturnDto> getAll() throws Exception;
  
    
}




