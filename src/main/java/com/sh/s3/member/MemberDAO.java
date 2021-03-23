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

@Repository
public class MemberDAO {

	//mapper와 DB위치 확인
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.sh.s3.member.memberDAO."; 
	
	//login - id pw 받아서 조회
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		memberDTO = sqlSession.selectOne(NAMESPACE+"memberLogin", memberDTO);	
		return memberDTO;
	}
	public int memberJoin (MemberDTO memberDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"memberJoin", memberDTO);
	}
	
	public int memberDelete(MemberDTO memberDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"memberDelete", memberDTO);
	}
	
	public int memberUpdate(MemberDTO memberDTO) throws Exception{
		//id를 제외하고 나머지를 수정
		return sqlSession.update(NAMESPACE+"memberUpdate", memberDTO);
	}
	
	
}

