package com.sh.sh3.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.sh.s3.notice.noticeDAO.";
	
	//getList
	public List<NoticeDTO> getList(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList", noticeDTO);
	}
	
	public NoticeDTO getSelect(NoticeDTO noticeDTO)throws Exception{
		noticeDTO = sqlSession.selectOne(NAMESPACE+"getSelect", noticeDTO);
		return noticeDTO;
	}
	
	
	
}
