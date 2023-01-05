package kr.co.ch05.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.User2VO;

@Repository
public class User2DAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser2(User2VO vo) {
		mybatis.insert("user2.insertUser2", vo);
	}
	
	
}
