package com.denizyercel.libraryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denizyercel.libraryapp.dao.AuthorRepository;
import com.denizyercel.libraryapp.dao.BookRepository;
import com.denizyercel.libraryapp.dao.PublisherRepository;
import com.denizyercel.libraryapp.entity.Author;
import com.denizyercel.libraryapp.entity.Book;
import com.denizyercel.libraryapp.entity.Publisher;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	PublisherRepository publisherRepository;

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book findById(Long id) {
		Optional<Book> result = bookRepository.findById(id);
		Book book =null;
		if (result.isPresent())
			book = result.get();
		else
			throw new RuntimeException("Kitap bulunamadı. ID: " + id);
		return book;
		
	}

	@Override
	public void save(Book book) {
		bookRepository.save(book);
		
	}

	public void deleteById(Long id) {
		bookRepository.deleteById(id);
		
	}

	public List<Book> getSearchBooks(String arananKelime) {
		List<Book> fBooks = bookRepository.findBooksByKeyword(arananKelime);
		return fBooks;
	}

	
	public List<Author> getAllAuthorForBooks() {
		return authorRepository.findAll();
	}

	
	public List<Publisher> getAllPublisherForBooks() {
		return publisherRepository.findAll();
	}

	
	public List<Book> getAllOrderedBooks() {
		return bookRepository.getOrderedBooks();
	}

	
	public List<Book> getAllOrderedBooksWithLimit() {
		return bookRepository.getOrderedBooksWithLimit();
	}

	
}
