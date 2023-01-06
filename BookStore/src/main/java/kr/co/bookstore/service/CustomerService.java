package kr.co.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookstore.dao.CustomerDao;
import kr.co.bookstore.vo.CustomerVo;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao dao;
	
	
	public void insertCustomer(CustomerVo vo) {
		dao.insertCustomer(vo);
	}
	
	public CustomerVo selectCustomer(String custId) {
		return dao.selectCustomer(custId);
	}
	
	public List<CustomerVo> selectCustomers(){
		return dao.selectCustomers();
	}
	
	public void updateCustomer(CustomerVo vo) {
		dao.updateCustomer(vo);
	}
	
	public void deleteCustomer(String custId) {
		dao.deleteCustomer(custId);
	}
	
}
