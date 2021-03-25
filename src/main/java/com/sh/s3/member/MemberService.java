package com.sh.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//객체생성
@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	public int memberUpdate(MemberDTO memberDTO) throws Exception{
		return memberDAO.memberUpdate(memberDTO);
	}
	
	public int memberDelete(MemberDTO memberDTO) throws Exception{
		return memberDAO.memberDelete(memberDTO);
	}
	
	//Join할 때 member의 정보를 가진 DTO가 필요함
	public int memberJoin(MemberDTO memberDTO)throws Exception{
		return memberDAO.memberJoin(memberDTO);
		
	}
	//Login은 return이 DTO이다.
	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		return memberDAO.memberLogin(memberDTO);
		
	}
	
}
