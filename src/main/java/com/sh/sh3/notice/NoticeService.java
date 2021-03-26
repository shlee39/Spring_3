package com.sh.sh3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO> getList(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.getList(noticeDTO);
	}
}
