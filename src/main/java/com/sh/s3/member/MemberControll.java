package com.sh.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//여기로 오는 member로 시작하는 모든 url들을 받아주자 
@RequestMapping(value="/member/**")
public class MemberControll {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("memberJoin")
	public void memberJoin()throws Exception{}
	
	@RequestMapping(value="memberJoin", method=RequestMethod.POST)
	public void memberJoin(MemberDTO memberDTO)throws Exception {
		int result = memberService.memberJoin(memberDTO);
	}
	
	//Login
	//get 방식(생략). 보내줄 것이 없음! 
	@RequestMapping("memberLogin")
	public void memberLogin() throws Exception{
		
	}

	
	@RequestMapping(value="memberLogin", method=RequestMethod.POST)
	public String memberLogin(MemberDTO memberDTO) throws Exception{
		memberDTO = memberService.memberLogin(memberDTO);
		//login 후 index 페이지가 나오게 한다
		return "redirect:../";
	}
	
	//----------------백엔드 완성!--------------------------------------
}
