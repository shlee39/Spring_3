package com.sh.s3.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sh.s3.bankbook.BankBookDTO;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.sh.s3.member.memberDAO"; 
	
	public int memberUpdate(MemberDTO memberDTO) throws Exception{
		//id를 제외하고 나머지를 수정
		return sqlSession.update(NAMESPACE+".memberUpdate", memberDTO);
	}
	
	public int memberDelete(MemberDTO memberDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+".memberDelete", memberDTO);
		
	}
	
	public int memberJoin (MemberDTO memberDTO) throws Exception {
	    int result = sqlSession.insert(NAMESPACE+".memberJoin", memberDTO);
		return result;
	}
	

	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		memberDTO = sqlSession.select(NAMESPACE+".memberLogin", memberDTO);	
		return memberDTO;
	}
}

