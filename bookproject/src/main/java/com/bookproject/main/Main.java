package com.bookproject.main;

import java.sql.SQLException;

import com.bookproject.daoimpl.BookDaoImpl;
import com.bookproject.dbconfig.DbConfig;
import com.bookproject.entity.Book;

public class Main {
	public static void main(String[] args) throws SQLException {
		BookDaoImpl bdao = new BookDaoImpl();
		DbConfig.makeConnection();
		bdao.createBookTable();
		System.out.println("inserting into book table");
		Book b1 = new Book(01, "Java Book", "JamesGosling", "Basics of Java", 500, "https://dev.java/learn/");
		Book b2 = new Book(02, "NET Core", "Pulumi", "OOPS Programming Language", 500,
				"https://learn.microsoft.com/en-us/dotnet/");
		bdao.insertBook(b1);
		bdao.insertBook(b2);
		bdao.updateBookName();
		bdao.retriveBookDetails();
		bdao.deleteBook();
		bdao.listOfBooksByPrice();

	}
}
