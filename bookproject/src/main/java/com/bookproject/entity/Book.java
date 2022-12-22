package com.bookproject.entity;

public class Book {
	int bookID;
	String bookName;
	String author;
	String description;
	int bookPrice;
	String bookURL;
	public int getBookId() {
		return bookID;
	}
	public void setBookId(int bookId) {
		this.bookID = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthors() {
		return author;
	}
	public void setAuthors(String authors) {
		this.author = authors;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getURLofBook() {
		return bookURL;
	}
	public void setURLofBook(String uRLofBook) {
		bookURL = uRLofBook;
	}
	public Book() {
		super();
		
	}
	public Book(int bookId, String bookName, String authors, String description, int bookPrice, String uRLofBook) {
		super();
		this.bookID = bookId;
		this.bookName = bookName;
		this.author = authors;
		this.description = description;
		this.bookPrice = bookPrice;
		bookURL = uRLofBook;
	}
	
}
