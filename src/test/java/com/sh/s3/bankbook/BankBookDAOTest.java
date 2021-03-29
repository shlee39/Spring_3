package com.sh.s3.bankbook;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sh.s3.MyAbstractTest;

public class BankBookDAOTest extends MyAbstractTest{

	@Autowired
	private BankBookDAO bankBookDAO;
	
	public void setDeleteTest() throws Exception {
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(9);
		int result = bankBookDAO.setDelete(bankBookDTO);
		
		assertEquals(1, result);
	}
	
	@Test
	public void getSelectTest() throws Exception{
		BankBookDTO bankBookDTO = bankBookDAO.getSelect(null);
		assertNotNull(bankBookDTO);
		
		
	}
	
	//@Test
	public void setWriteTest() throws Exception {
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName("Test");
		bankBookDTO.setBookRate(0.12);
		bankBookDTO.setBookSale("Y");
		
		int result = bankBookDAO.setWrite(bankBookDTO);
		//성공하면 숫자 1 리턴 (1 개가 들어온 것이니까)
		
		assertEquals(1, result);
	}
	

}
