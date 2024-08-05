/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.Dto;

/**
 *
 * @author ASUS
 */
public class MemberDto {
    
    private String memberId;
    private String memberName;
    private String email;
    private String phNo;

    public MemberDto() {
    }

    public MemberDto(String memberId, String memberName, String email, String phNo) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.email = email;
        this.phNo = phNo;
    }

    /**
     * @return the memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * @return the memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * @param memberName the memberName to set
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phNo
     */
    public String getPhNo() {
        return phNo;
    }

    /**
     * @param phNo the phNo to set
     */
    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return "MemberDto{" + "memberId=" + memberId + ", memberName=" + memberName + ", email=" + email + ", phNo=" + phNo + '}';
    }
    
    
}
