//package com.sh.s3.account;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.List;
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AccountService {
//
//	@Autowired
//	private AccountDAO accountDAO;
//	
//	public int setInsert(AccountDTO accountDTO)throws Exception{
//		//중복이 나오지 않는 것
//		//1. Random - 우연하게 중복숫자가 발생할 수도 있다
//		//2. Time
//		//3. Java API 활용
////		return accountDAO.setInsert(accountDTO);
//		
//		//2. Time
//		//날짜와 시간을 다루는 클래스 = Calendar
//		//추상 클래스라 객체를 다른 방식으로 생성한다.
//		Calendar ca = Calendar.getInstance();
//		long time = ca.getTimeInMillis(); //현재시간을 밀리세컨즈로 나타낸다
//		System.out.println(time);
//		
//		//숫자 사이에 '-' 입력하기
//		String t = time+""; //공백을 추가함으로서 최종 데이터 타입은 문자열이 된다.
//		t = String.valueOf(time);
//		
//		String result = t.substring(0, 4)+"-"; //1616- ...
//		result = result + t.substring(4, 8)+"-"; //1616-7207
//		result = result + t.substring(8); //1616-7207-52321
//		
//		System.out.println(result);
//		
//		//SimpleDateFormat
//		SimpleDateFormat sd = new SimpleDateFormat("ddyyyyMM-HHmmss-S");
//		String r = sd.format(ca.getTime());
//		System.out.println(r);
//		
//		//3. Java API
//		//Universal Unique ID: 중복이 없는 특정한 값을 준다
//		//출력되는 숫자가 너무 크고 길다
//		String name = UUID.randomUUID().toString();
//		System.out.println(name);
//		
//		accountDTO.setAccountNumber(r);
//		
//		return accountDAO.setInsert(accountDTO);
//	}
//	
//	public List<AccountDTO> getList(AccountDTO accountDTO)throws Exception{
//		return accountDAO.getList(accountDTO);
//		
//	}
//}
