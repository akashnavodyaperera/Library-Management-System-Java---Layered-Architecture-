/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Service.Custom.Impl;

import java.util.ArrayList;
import lms.Dao.Custom.MemberDao;
import lms.Dao.DaoFactory;
import lms.Dto.MemberDto;
import lms.Entity.MemberEntity;
import lms.Service.Custom.MemberService;

/**
 *
 * @author ASUS
 */
public class MemberServiceImpl implements MemberService {
    
    private MemberDao memberDao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER);

    @Override
    public String save(MemberDto memberdto) throws Exception {
    MemberEntity entity =  getMemberEntity(memberdto);
    return memberDao.create(entity)? "Sucess":"Fail";           }

    @Override
    public String update(MemberDto memberdto) throws Exception {
    MemberEntity entity =  getMemberEntity(memberdto);
    return memberDao.update(entity)? "Sucess":"Fail";  
    }

    @Override
    public String delete(String memberID) throws Exception {
    return memberDao.delete(memberID)? "Sucess":"Fail";
    }

    @Override
    public MemberDto get(String bookID) throws Exception {
    MemberEntity entity = memberDao.get(bookID);
        if (entity != null) {
            return getMemberDto(entity);            
        }
        return null;        }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
      ArrayList<MemberEntity> memberEntities = memberDao.getAll();
        ArrayList<MemberDto> memberDtos = new ArrayList<>();
        if (memberEntities != null) {
            for (MemberEntity memberEntity : memberEntities) {
                memberDtos.add(getMemberDto(memberEntity));
            }
        }
        return memberDtos;
    }
    
    private MemberEntity getMemberEntity(MemberDto memberDto){
        return new MemberEntity(memberDto.getMemberId(),
                memberDto.getMemberName(), memberDto.getEmail(), memberDto.getPhNo());
    }
    
     private MemberDto getMemberDto (MemberEntity entity){
        return new MemberDto(entity.getMemberId(), entity.getMemberName(), entity.getEmail(), entity.getPhNo());
    }
}
