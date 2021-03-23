package com.sh.s3.member;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sh.s3.MyAbstractTest;

public class MemberDAOTest extends MyAbstractTest{

	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void MemberLoginTest() throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("iu");
		memberDTO.setPw("pw1");
		memberDTO = memberDAO.memberLogin(memberDTO);
		
		assertNotNull(memberDTO);
		
	}
	
	//@Test
//	public void MemberJoinTest() throws Exception {
//		
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setId("t1");
//		memberDTO.setPw("t1");
//		memberDTO.setName("test");
//		memberDTO.setPhone("01011111111");
//		memberDTO.setEmail("t1@google.com");
//		int result = memberDAO.memberJoin(memberDTO);
//		
//		assertEquals(1, result);
//	}

	
	//@Test
//	public void memberUpdateTest() throws Exception {
//		
//		MemberDTO memberDTO = new MemberDTO();
//		
//		memberDTO.setId("t1");
//		memberDTO.setPw("tt1");
//		memberDTO.setName("tt1");
//		memberDTO.setPhone("01022222222");
//		memberDTO.setEmail("tt1@google.com");
//		
//		int result = memberDAO.memberUpdate(memberDTO);
//		assertEquals(1, result);
//		
//
//}
//	public void memberDeleteTest() throws Exception{
//		
//		MemberDTO memberDTO = new MemberDTO()
//		
//		
//	}


}