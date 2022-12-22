package com.bookproject.dao;

import java.awt.print.Book;
import java.sql.SQLException;

public interface BookDao {
	void createBookTable();

	boolean insertBook(Book b);

	void retriveBookDetails();

	int updateBookName() throws SQLException;

	void deleteBook();

	void listOfBooksByPrice();
}
