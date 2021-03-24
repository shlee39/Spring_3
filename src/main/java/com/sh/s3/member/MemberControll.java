package com.sh.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberControll {
	
	@Autowired
	private MemberService memberService;
	
	
	public void memberJoin(MemberDTO memberDTO)throws Exception {
		
	}
	
	public void memberLogin(MemberDTO memberDTO)throws Exception{
		
	}
}
