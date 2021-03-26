package com.sh.s3.notice;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sh.s3.MyAbstractTest;
import com.sh.sh3.notice.NoticeDAO;
import com.sh.sh3.notice.NoticeDTO;

public class NoticeDAOTest extends MyAbstractTest {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void getListTest() throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(1);
		
		List<NoticeDTO> ar = noticeDAO.getList(noticeDTO);
		
		assertNotEquals(0, ar.size());
	}
}
