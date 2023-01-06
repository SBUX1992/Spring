package kr.co.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookstore.dao.BookDao;
import kr.co.bookstore.vo.BookVo;

@Service
public class BookService {
	
	@Autowired
	private BookDao dao;
	
	public void insertBook(BookVo vo) {
		dao.insertBook(vo);
	}
	
	public BookVo selectBook(String bookId) {
		return dao.selectBook(bookId);
	}
	
	public List<BookVo> selectBooks(){
		return dao.selectBooks();
	}
	
	public void updateBook(BookVo vo) {
		dao.updateBook(vo);
	}
	
	public void deleteBook(String bookId) {
		dao.deleteBook(bookId);
	}
	
	
}
