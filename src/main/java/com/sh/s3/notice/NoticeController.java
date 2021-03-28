package com.sh.s3.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("noticeList")
	public void getList(Model model) throws Exception {
		List<NoticeDTO> ar = noticeService.getList();
		model.addAttribute("list", ar);			
	}
	
	@RequestMapping("noticeSelect")
	public ModelAndView getSelect(NoticeDTO noticeDTO) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		noticeDTO = noticeService.getSelect(noticeDTO);
		modelAndView.addObject("dto",noticeDTO);
		modelAndView.setViewName("notice/noticeSelect");
		return modelAndView;
	}
	
	@RequestMapping("noticeDelete")
	public String setDelete(NoticeDTO noticeDTO) throws Exception {
		int result = noticeService.setDelete(noticeDTO);
		return "redirect:./noticeList";
	}
	
	@RequestMapping("noticeUpdate")
	public void setUpdate(NoticeDTO noticeDTO, Model model) throws Exception {
		noticeDTO = noticeService.getSelect(noticeDTO);
		model.addAttribute("dto", noticeDTO);
	}
	
	@RequestMapping(value = "noticeUpdate", method = RequestMethod.POST)
	public String setUpdate (NoticeDTO noticeDTO) throws Exception {
		int result = noticeService.setUpdate(noticeDTO);
		return "redirect:./noticeList";
	}
	
	@RequestMapping("noticeInsert")
	public void setInsert() throws Exception {
		
	}
	
	@RequestMapping(value = "noticeInsert" , method = RequestMethod.POST)
	public String setInsert(NoticeDTO noticeDTO) throws Exception {
		int result = noticeService.setInsert(noticeDTO);
		return "redirect:./noticeList";
	}
}