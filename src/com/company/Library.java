package com.company;
import java.util.*;

/**
 * Created by RENT on 2017-04-26.
 */
public class Library {


	List<Book> allBooks = new ArrayList<>();

	public void addBook(Book book) {
		allBooks.add(book);
	}

	public Book borrowBook(String title) {
		return searchBook(title);
	}

	public Boolean returnBook(Book bookToReturn) {

		boolean result = false;
		Book bookFound = searchBook(bookToReturn);

		if (bookFound != null) {

		result = bookFound.equals(bookToReturn);
		}
		return result;
	}

	public void removeBook(Book book) {
		allBooks.remove(book);
	}

	public void removeBook(String bookTitle) {
		Book bookFound = searchBook(bookTitle);
		if (bookFound != null)
			allBooks.remove(bookFound);
	}

	public Book searchBook (Book title){
		return searchBook(title.getBookTitle());
	}

	public Book searchBook(String title) {

		boolean isBookFound = false;
		int idx = 0;
		Book book = null;

		while (isBookFound == false) {
			book = allBooks.get(idx);
			isBookFound = book.getBookTitle().equals(title);
			idx++;
		}
		return book;
	}

	public Library(List<Book> acquiredBooks) {
		allBooks.addAll(acquiredBooks);
	}
}
