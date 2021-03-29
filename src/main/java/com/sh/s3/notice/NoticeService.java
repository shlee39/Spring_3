package com.sh.s3.notice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.s3.util.Pager;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO> getList(Pager pager)throws Exception{
		int perPage=10; // 한페이지당 보여줄 글의 갯수
		
		// ---- startRow, lastRow ----
		long startRow = (pager.getCurPage()-1)*perPage+1;
		long lastRow = pager.getCurPage()*perPage;
		
		pager.setStartRow(startRow);
		pager.setLastRow(lastRow);
		// ----------------------------------
		
		long totalCount = 110;
		long totalPage = (totalCount/perPage);
		
		if(totalCount%perPage != 0) {
			totalPage++;
		}
		
		System.out.println("TotalPage : "+totalPage);
		
		return noticeDAO.getList(pager);
	}

}