package com.sh.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	
	//DAO에 의존적 (DAO가 있어야 한다)
	//DAO에 Repository 선언 확인 - 연결시켜준다.
	@Autowired
	private BankBookDAO bankBookDAO; //DAO 선언 및 주입해줘야 함 (의존성 주입 Dependency Injection)
	
	//DAO와 동일한 메서드들을 생성해준다.	
	//Service의 메서드들을 Controller에서 호출할 것이다.
	public List<BankBookDTO> getList() throws Exception {
		return bankBookDAO.getList();
	}
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.getSelect(bankBookDTO);
	}
}
