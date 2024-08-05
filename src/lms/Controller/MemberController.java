/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Controller;

import java.util.ArrayList;
import lms.Dto.MemberDto;
import lms.Service.Custom.MemberService;
import lms.Service.ServiceFactory;

/**
 *
 * @author ASUS
 */
public class MemberController {
    
    private MemberService memberService = (MemberService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);
    
     public String save(MemberDto memberdto)throws Exception{
        return memberService.save(memberdto); 
    }
     
     public String update(MemberDto memberdto)throws Exception{
        return memberService.update(memberdto); 
    }
     
     public String delete(String memberID)throws Exception{
        return memberService.delete(memberID); 
    }
    
      public ArrayList<MemberDto> getAll()throws Exception{
        return memberService.getAll(); 
    }
      
      public MemberDto get(String memberId)throws Exception{
        return memberService.get(memberId); 
    }
}
