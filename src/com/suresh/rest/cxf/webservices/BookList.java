package com.suresh.rest.cxf.webservices;

import java.util.ArrayList;
import java.util.List;

public class BookList {
	private List<BookVO> bookList;

	public List<BookVO> getBookList() {
		if (bookList == null) {
			bookList = new ArrayList<BookVO>();
		}
		return bookList;
	}

	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public static void main(String args[]){
		System.out.println("Git installed Successfully");
	}
	
	

}
