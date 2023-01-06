package kr.co.bookstore.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bookstore.vo.CustomerVo;


@Repository
public class CustomerDao {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public void insertCustomer(CustomerVo vo) {
		mybatis.insert("customer.insertCustomer", vo);
	}
	
	public CustomerVo selectCustomer(String custId) {
		return mybatis.selectOne("customer.selectCustomer", custId);
	}
	
	public List<CustomerVo> selectCustomers(){
		return mybatis.selectList("customer.selectCustomers");
	}
	
	public void updateCustomer(CustomerVo vo) {
		mybatis.update("customer.updateCustomer", vo);
	}
	
	public void deleteCustomer(String custId) {
		mybatis.delete("customer.deleteCustomer", custId);
	}
}
