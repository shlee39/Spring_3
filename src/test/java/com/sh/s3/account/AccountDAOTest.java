package com.sh.s3.account;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sh.s3.MyAbstractTest;

public class AccountDAOTest extends MyAbstractTest{

	@Autowired
	private AccountDAO accountDAO;
	
//	//@Test
//	public void getListTest()throws Exception{
//		AccountDTO accountDTO = new AccountDTO();
//		accountDTO.setId("iu");
//		
//		List<AccountDTO> ar = accountDAO.getList(accountDTO);
//		
//		assertNotEquals(0, ar.size());
//	}
	
	@Test
	public void setInsertTest() throws Exception{
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccountNumber("165-953-5175");
		accountDTO.setAccountBalance(0);
		accountDTO.setId("iu");
		accountDTO.setBookNumber(1);
		int result= accountDAO.setInsert(accountDTO);
		
		assertEquals(1, result);
		
		
		
	}

}
