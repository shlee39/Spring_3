package com.sh.s3.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sh.s3.bankbook.BankBookDTO;

@Repository
public class MemberDAO {
	
	public int memberUpdate(MemberDTO memberDTO) throws Exception{
		//id를 제외하고 나머지를 수정
		return sqlSession.update(NAMESPACE+".setUpdate", memberDTO);
	
	}
	
	public int memberDelete(MemberDTO memberDTO) throws Exception{
		
		
	}

	
}