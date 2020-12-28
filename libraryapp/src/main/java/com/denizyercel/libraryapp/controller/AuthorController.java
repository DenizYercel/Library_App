package com.denizyercel.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.denizyercel.libraryapp.entity.Author;
import com.denizyercel.libraryapp.service.AuthorService;

@Controller
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;

	@GetMapping("/authorList")
	public String viewHomePage(Model model) {
		model.addAttribute("listAuthors", authorService.findAll());
		return "author_list";
	}

	@GetMapping("/showNewAuthorForm")
	public String showNewAuthorForm(Model model) {
		Author author = new Author();
		model.addAttribute("author", author);
		return "new_author";
	}

	@PostMapping("/saveAuthor")
	public String saveAuthor(@ModelAttribute("author") Author author) {
		
		if (author.getAuthorName()=="" || author.getAuthorName()==null) {
			return "redirect:/showNewAuthorForm?error=true";
		}else {
			authorService.save(author);
			return "redirect:/authorList";
		}
		
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model) {
		Author author = authorService.findById(id);
		model.addAttribute("author", author);
		return "update_author";
	}

	@GetMapping("/deleteAuthor/{id}")
	public String deleteAuthor(@PathVariable(value = "id"  ) Long id) {
		this.authorService.deleteById(id);
		return "redirect:/authorList";
	}

}
