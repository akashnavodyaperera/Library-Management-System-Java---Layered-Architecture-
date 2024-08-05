/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Dao.Custom.Impl;

import java.util.ArrayList;
import lms.Dao.CrudUtil;
import lms.Dao.Custom.MemberDao;
import lms.Entity.MemberEntity;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class MemberDaoImpl implements MemberDao {

    @Override
    public boolean create(MemberEntity t) throws Exception {
    return CrudUtil.executeUpdate("INSERT INTO member VALUES(?,?,?,?)", t.getMemberId(), t.getMemberName(), t.getEmail(), t.getPhNo());      }

    @Override
    public boolean update(MemberEntity t) throws Exception {
    return CrudUtil.executeUpdate(
        "UPDATE member SET Member_Name = ?, Email = ?, Phone_No = ? WHERE Member_ID = ?",
        t.getMemberName(), t.getEmail(), t.getPhNo(), t.getMemberId()
    );
    }

    @Override
    public boolean delete(String id) throws Exception {
    return CrudUtil.executeUpdate("DELETE FROM member WHERE Member_ID = ?", id);    }

    @Override
    public MemberEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM member WHERE Member_ID = ?", id); 
        if (rst.next()) {
            MemberEntity entity = new MemberEntity(rst.getString("Member_ID"), rst.getString("Member_Name"), rst.getString("Email"), rst.getString("Phone_No"));
            return entity;
        }
        return null;  
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
    ArrayList<MemberEntity> memberEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM member");
        
        while (rst.next()) {
            MemberEntity entity = new MemberEntity(rst.getString("Member_ID"), rst.getString("Member_Name"), rst.getString("Email"), rst.getString("Phone_No"));
            memberEntities.add(entity);
        }
        return memberEntities;
    }      


}
    

