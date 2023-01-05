package kr.co.ch05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.User2DAO;
import kr.co.ch05.vo.User2VO;


@Service
public class User2Service {
	
	@Autowired
	private User2DAO dao;
	
	public void insertUser2(User2VO vo) {
		dao.insertUser2(vo);
	}
	
}
