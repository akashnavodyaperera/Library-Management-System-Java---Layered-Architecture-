/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lms.Service.Custom;

import java.util.ArrayList;
import lms.Dto.MemberDto;
import lms.Service.SuperService;

/**
 *
 * @author ASUS
 */
public interface MemberService extends SuperService {
    String save(MemberDto memberdto) throws Exception;
    String update(MemberDto memberdto) throws Exception;
    String delete(String memberID) throws Exception;
    MemberDto get(String bookID) throws Exception;
    ArrayList<MemberDto> getAll() throws Exception;
}
