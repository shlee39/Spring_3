package com.sh.sh3.notice;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("accountList")
	public void getList(HttpSession session, Model model)throws Exception{
		NoticeDTO noticeDTO = (NoticeDTO)session.getAttribute("notice");
	}
}
