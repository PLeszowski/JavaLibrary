package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {


		Book book1 = new Book("Pan Tadeusz");
		Book book2 = new Book("Matrix");
		Book book3 = new Book("Ogniem i Mieczem");
		Book book4 = new Book("Cujo");

		List<Book> booksForLibrary = new ArrayList<>();

		booksForLibrary.add(book1);
		booksForLibrary.add(book2);
		booksForLibrary.add(book3);
		booksForLibrary.add(book4);

		Library library = new Library(booksForLibrary);

		library.removeBook(book1);
		library.removeBook("Cujo");

		Book borrowedBook = library.borrowBook("Ogniem i Mieczem");

		System.out.println("Number of books in library: " + library.allBooks.size());
		System.out.println("Borrowed book is: " + borrowedBook.getBookTitle());

		Book bookToReturn = borrowedBook;

		boolean returnSuccess = library.returnBook(book3);

		System.out.println("Book returned " + returnSuccess);


	}
}
