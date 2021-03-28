//package com.sh.s3.member;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@Controller
////여기로 오는 member로 시작하는 모든 url들을 받아주자 
//@RequestMapping(value="/member/**")
//public class MemberControll {
//	
//	@Autowired
//	private MemberService memberService;
//	
//	//정보 수정
//	@RequestMapping("memberUpdate")
//	public void memberUpdate() throws Exception{}
//		
//	@RequestMapping(value="memberUpdate", method=RequestMethod.POST)
//	public String memberUpdate(MemberDTO memberDTO, HttpSession session) throws Exception{
//		int result = memberService.memberUpdate(memberDTO);
//		
//		if(result>0) {
//			session.setAttribute("member", memberDTO);			
//		}
//		
//		return "redirect:../";
//}
//	
//	//로그인한 세션을 받아와서 사용
//	@RequestMapping("memberDelete")
//	public String memberDelete(HttpSession session) throws Exception {
//		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
//		int result = memberService.memberDelete(memberDTO);
//		
//		session.invalidate(); //삭제하면서 로그아웃도 되게 한다.
//		
//		return "redirect:../";
//	}
//	
//	
//	
//	//mypage 연결
//	//1.데이터베이스에서 다시 조회해오는 방법 - 보안을 위해서 이 방법이 맞음
//	//2.세션에서 꺼내는 방법 (세션에 모든 정보가 들어있기 때문)
//	@RequestMapping("memberPage")
//	public void memberPage() throws Exception{
//		
//	}
//	
//	
//	//로그아웃 - 세션을 없애든가(타임아웃), 세션안의 데이터를 날리든가
//	@RequestMapping("memberLogout")
//	public String memberLogout(HttpSession session)throws Exception{
//		session.invalidate(); //세션 유지시간을 0으로 만든다. = 로그아웃
//		return "redirect:../"; //로그아웃 후 root로 돌아간다.
//	}
//	
//	
//	@RequestMapping("memberJoin")
//	public void memberJoin()throws Exception{}
//	
//	@RequestMapping(value="memberJoin", method=RequestMethod.POST)
//	public void memberJoin(MemberDTO memberDTO)throws Exception {
//		int result = memberService.memberJoin(memberDTO);
//	}
//	
//	//Login
//	//get 방식(생략). 보내줄 것이 없음! 
//	@RequestMapping("memberLogin")
//	public void memberLogin() throws Exception{
//		
//	}
//
//	
//	@RequestMapping(value="memberLogin", method=RequestMethod.POST)
//	public String memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception{
//		memberDTO = memberService.memberLogin(memberDTO);
//		//비어있는지 아닌지 확인!
//		System.out.println(memberDTO);
//		
//		//session은 웹브라우저를 닫거나 일정 시간이 지나면 없어진다.
//		session.setAttribute("member", memberDTO);
//		//model.addAttribute(memberDTO);
//		
//		//login 후 index 페이지가 나오게 한다
//		return "redirect:../";
//	}
//	
//	
//}
