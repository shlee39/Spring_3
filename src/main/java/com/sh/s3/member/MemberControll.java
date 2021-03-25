package com.sh.s3.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//여기로 오는 member로 시작하는 모든 url들을 받아주자 
@RequestMapping(value="/member/**")
public class MemberControll {
	
	@Autowired
	private MemberService memberService;
	
	
	//로그아웃 - 세션을 없애든가(타임아웃), 세션안의 데이터를 날리든가
	@RequestMapping("memberLogout")
	public String memberLogout(HttpSession session)throws Exception{
		session.invalidate(); //세션 유지시간을 0으로 만든다. = 로그아웃
		return "redirect:../"; //로그아웃 후 root로 돌아간다.
	}
	
	
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
	public String memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception{
		memberDTO = memberService.memberLogin(memberDTO);
		//비어있는지 아닌지 확인!
		System.out.println(memberDTO);
		
		//session은 웹브라우저를 닫거나 일정 시간이 지나면 없어진다.
		session.setAttribute("member", memberDTO);
		//model.addAttribute(memberDTO);
		
		//login 후 index 페이지가 나오게 한다
		return "redirect:../";
	}
	
	@RequestMapping("memberPage")
	public void memberPage() throws Exception {
		
	}
	
	
}
