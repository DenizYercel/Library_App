package com.denizyercel.libraryapp.service;

import java.util.List;

import com.denizyercel.libraryapp.entity.Author;
import com.denizyercel.libraryapp.entity.Book;
import com.denizyercel.libraryapp.entity.Publisher;

public interface BookService {
	
	public List<Book> findAll();
	public Book findById(Long id);
	public void save(Book book);
	public void deleteById(Long id);
	
	List<Book> getSearchBooks(String searchWord);
	List<Author> getAllAuthorForBooks();
	List<Publisher> getAllPublisherForBooks();
	List<Book> getAllOrderedBooks();
	List<Book> getAllOrderedBooksWithLimit();

}
