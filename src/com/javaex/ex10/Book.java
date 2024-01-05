package com.javaex.ex10;

public class Book {
    
    private int bookNo;
    private String title;
    private String aythor;
    private int stateCode;
    private String state;
    
    public Book(int bookNo, String title, String aythor) {
    	
		this.bookNo = bookNo;
		this.title = title;
		this.aythor = aythor;
		stateCode = 1;
		state = "재고있음";
	}
    
    
    public int getBookNo() {
		return bookNo;
	}


	public String getTitle() {
		return title;
	}


	public String getAythor() {
		return aythor;
	}


	public int getStateCode() {
		return stateCode;
	}


	public void rent(int stateCode) {
    	if(stateCode == 0) {
    		state = "대여중";
    	}
    	else {
    		state = "재고있음";
    	}
    }
    public void print() {
    	System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + aythor + ", 대여유무:" + state);
    }
    
}
