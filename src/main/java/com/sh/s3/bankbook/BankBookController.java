package com.sh.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//Controller 역할 부여
@Controller
//Controller로 들어오는 애들은 모두 bankbook으로 시작한다
//경로를 쉽게 손봐주기!
@RequestMapping(value = "/bankbook/**") 
//bankbook으로 시작하는 모든 애들. 앞으로 /bankbook/경로는 삭제하면 됨. 자동으로 입력된다.
public class BankBookController {
	
	//Service에 대해 의존적이다
	//객체 만들고 주입시켜주기
	
	@Autowired
	private BankBookService bankBookService;
	
	//해당 주소가 들어오면 실행하자! Update 페이지
	@RequestMapping("bankbookUpdate")
	public void setUpdate(BankBookDTO bankBookDTO, Model model) throws Exception {
			
		bankBookDTO= bankBookService.getSelect(bankBookDTO);
		model.addAttribute("dto", bankBookDTO);
		
	}
	
	
	
	
	//update 버튼으로 들어온 데이터를 받는 작업
	@RequestMapping(value="bankbookUpdate", method=RequestMethod.POST)
	public String setUpdate(BankBookDTO bankBookDTO)throws Exception{
		int result = bankBookService.setUpdate(bankBookDTO);
		return "redirect:./bankbookList";
	}
	
	
	@RequestMapping("bankbookDelete")
	public String setDelete(BankBookDTO bankBookDTO)throws Exception{
		System.out.println("Delete");
		System.out.println(bankBookDTO.getBookNumber());
		int result = bankBookService.setDelete(bankBookDTO);
		System.out.println(result);
		
		//다시 리스트로 돌아오는 것
		return "redirect:./bankbookList";
		
	}
	
	//실행할 수 있는 메서드 준비
	//이 메서드는 특정 주소가 들어왔을 때 실행한다. 형식은 GET 방식 (생략하면 GET방식으로 자동 설정)
	@RequestMapping(value = "bankbookList")
	//경로명을 하나만 쓴다면 'value= '속성은 생략해도 무방하다. 두 개 이상은 value=과 함께 쉼표 작성.
	public void getList(Model model) throws Exception {
		List<BankBookDTO> ar = bankBookService.getList();
		//경로명과 jsp 경로명이 동일하기 때문에 void로 두어도 무방하다.
		//jsp로 받은 데이터를 보내준다.
		model.addAttribute("list", ar);

	}
	
	@RequestMapping(value = "bankbookSelect")
	public ModelAndView getSelect(BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		bankBookDTO = bankBookService.getSelect(bankBookDTO);
		mv.addObject("dto", bankBookDTO);
		mv.setViewName("bankbook/bankbookSelect");
		return mv;
	}
	//---------------여기까지 백엔드 만드는 과정 ----------------------------------
}
