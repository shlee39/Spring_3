package com.sh.s3.account;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sh.s3.MyAbstractTest;

public class AccountServiceTest extends MyAbstractTest {
	//여기서 자바코드를 테스트함
	
	
	@Autowired
	private AccountService accountService;
	
	@Test
	public void setInsertTest()throws Exception {
		accountService.setInsert(null);
	}

	
}
