package com.entity;

public class Book {
	private int Book_id;
	private String Book_title;
	private String Book_author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int book_id, String book_title, String book_author) {
		super();
		Book_id = book_id;
		Book_title = book_title;
		Book_author = book_author;
	}
	public int getBook_id() {
		return Book_id;
	}
	public void setBook_id(int book_id) {
		Book_id = book_id;
	}
	public String getBook_title() {
		return Book_title;
	}
	public void setBook_title(String book_title) {
		Book_title = book_title;
	}
	public String getBook_author() {
		return Book_author;
	}
	public void setBook_author(String book_author) {
		Book_author = book_author;
	}
	@Override
	public String toString() {
		return "Book [Book_id=" + Book_id + ", Book_title=" + Book_title + ", Book_author=" + Book_author + "]";
	}
	
	

}
