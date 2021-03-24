package com.sh.s3.bankbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.sh.s3.bankbook.BankBookDAO"; 
	//상수는 전부 대문자로 표기해주면 구분이 쉽다.
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+".setDelete", bankBookDTO);
	}

	public int setWrite(BankBookDTO bankBookDTO) throws Exception{
		//호출하려는 sql문의 위치 지정. insert의 결과값이 숫자가 나온다.
		int result = sqlSession.insert(NAMESPACE+".setWrite", bankBookDTO);

		return result;
	}
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) throws Exception{
		//long num=1L;
		bankBookDTO = sqlSession.selectOne(NAMESPACE+".getSelect", bankBookDTO);
		
		return bankBookDTO;
		
		
	}
	
	//getList
		//bankbook table의 모든 데이트 조회 후 리턴
		public List<BankBookDTO> getList()throws Exception{
			ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();

			return ar;
		}

	
}