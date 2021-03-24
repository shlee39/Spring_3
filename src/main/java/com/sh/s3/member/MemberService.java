package com.sh.s3.member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

	private MemberDAO memberDAO;
	
	public int memberJoin(MemberDTO memberDTO)throws Exception{
		return memberDAO.memberJoin(memberDTO);
		
	}
	
	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		return memberDAO.memberLogin(memberDTO);
		
	}
	
}
