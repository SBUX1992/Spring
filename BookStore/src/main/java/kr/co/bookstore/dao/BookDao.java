package kr.co.bookstore.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bookstore.vo.BookVo;

@Repository
public class BookDao {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBook(BookVo vo) {
		mybatis.insert("book.insertBook", vo);
	}
	
	public BookVo selectBook(String bookId) {
		return mybatis.selectOne("book.selectBook", bookId);
	}
	
	public List<BookVo> selectBooks(){
		return mybatis.selectList("book.selectBooks");
	}
	
	public void updateBook(BookVo vo) {
		mybatis.update("book.updateBook", vo);
	}
	
	public void deleteBook(String bookId) {
		mybatis.delete("book.deleteBook", bookId);
	}
	
}
