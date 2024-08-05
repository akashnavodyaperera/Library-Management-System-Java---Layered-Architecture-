/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Service.Custom.Impl;

import java.util.ArrayList;
import lms.Dao.Custom.BorrowReturnDao;
import lms.Dao.DaoFactory;
import lms.Dto.BorrowReturnDto;
import lms.Entity.BorrowReturnEntity;
import lms.Service.Custom.BorrowReturnService;

/**
 *
 * @author ASUS
 */
public class BorrowReturnServiceImpl implements BorrowReturnService {
    
    private BorrowReturnDao borrowreturnDao = (BorrowReturnDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BORROWRETURN);

    @Override
    public String save(BorrowReturnDto borrowreturndto) throws Exception {
    BorrowReturnEntity entity =  getBorrowReturnEntity(borrowreturndto);
    return borrowreturnDao.create(entity)? "Sucess":"Fail";            }

    @Override
    public String update(BorrowReturnDto borrowreturndto) throws Exception {
    BorrowReturnEntity entity =  getBorrowReturnEntity(borrowreturndto);
    return borrowreturnDao.update(entity)? "Sucess":"Fail"; 
    }

    @Override
    public String delete(String borrowreturnID) throws Exception {
    return borrowreturnDao.delete(borrowreturnID)? "Sucess":"Fail";
    }

    @Override
    public BorrowReturnDto get(String borrowreturnID) throws Exception {
     BorrowReturnEntity entity = borrowreturnDao.get(borrowreturnID);
        if (entity != null) {
            return getBorrowReturnDto(entity);            
        }
        return null;    
    }

    @Override
    public ArrayList<BorrowReturnDto> getAll() throws Exception {
    ArrayList<BorrowReturnEntity> borrowreturnEntities = borrowreturnDao.getAll();
        ArrayList<BorrowReturnDto> borrowreturnDtos = new ArrayList<>();
        if (borrowreturnEntities != null) {
            for (BorrowReturnEntity borrowreturnEntity : borrowreturnEntities) {
                borrowreturnDtos.add(getBorrowReturnDto(borrowreturnEntity));
            }
        }
        return borrowreturnDtos;
    }
    
    
    private BorrowReturnEntity getBorrowReturnEntity(BorrowReturnDto borrowreturnDto){
        return new BorrowReturnEntity(borrowreturnDto.getBorrowId(),
                borrowreturnDto.getBookId(), borrowreturnDto.getMemberId(),borrowreturnDto.getBorrowDate(), borrowreturnDto.getDueDate(), borrowreturnDto.getReturnDate(), borrowreturnDto.getFine() );
    }

    private BorrowReturnDto getBorrowReturnDto (BorrowReturnEntity entity){
        return new BorrowReturnDto(entity.getBorrowId(), entity.getBookId(), entity.getMemberId(), entity.getBorrowDate(), entity.getDueDate(), entity.getReturnDate(), entity.getFine());
    }
    
}









