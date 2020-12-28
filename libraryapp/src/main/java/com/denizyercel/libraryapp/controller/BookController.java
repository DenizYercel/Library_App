package com.denizyercel.libraryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.denizyercel.libraryapp.entity.Book;
import com.denizyercel.libraryapp.service.BookService;


@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/")
	public String bookList(Model model) {	
	
		model.addAttribute("listBook", bookService.getAllOrderedBooks());
		return "index";
	}

	@GetMapping("/showNewBookForm")
	public String showNewBookForm(Model model) {
		
		
		Book book = new Book();
		model.addAttribute("book", book);
		model.addAttribute("authors", bookService.getAllAuthorForBooks());
		model.addAttribute("publishers", bookService.getAllPublisherForBooks());
		return "new_book";
	}

	@PostMapping("/saveBook")
	public String saveBook(@ModelAttribute("book") Book book) {
		

		if (book.getName() == "" || book.getName() == null || book.getBookAuthor() == ""
				|| book.getBookAuthor() == null || book.getIsbnNo() == "" || book.getIsbnNo() == null) {
			return "redirect:/showNewBookForm?error=true";
		} else {
			bookService.save(book);
			return "redirect:/";
		}

	}

	@GetMapping("/showBookFormForUpdate/{id}")
	public String showBookFormForUpdate(@PathVariable(value = "id") long id, Model model) {
	
		model.addAttribute("book", bookService.findById(id));
		model.addAttribute("authors", bookService.getAllAuthorForBooks());
		model.addAttribute("publishers", bookService.getAllPublisherForBooks());
		return "update_book";
	}

	@GetMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable(value = "id") long id) {
		
	
		this.bookService.deleteById(id);
		return "redirect:/";
	}

	@PostMapping("/showSearchResult")
	public String showSearchResult(@ModelAttribute("searchWord") String searchWord, Model model) {
		
	
		List<Book> foundedBooks = bookService.getSearchBooks(searchWord);
		model.addAttribute("foundedBooks", foundedBooks);
		model.addAttribute("searchWord", searchWord);
		model.addAttribute("foundedBooksSize", foundedBooks.size());
		return "search_result";
	}

}
