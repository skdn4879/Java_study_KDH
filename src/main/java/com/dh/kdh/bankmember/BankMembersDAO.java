package com.dh.kdh.bankmember;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankMembersDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.dh.kdh.bankmember.BankMembersDAO.";
	
	public List<BankMembersDTO> getSearchByID(String search)throws Exception{
		return sqlSession.selectList(NAMESPACE + "getSearchByID", search);
	}
}
