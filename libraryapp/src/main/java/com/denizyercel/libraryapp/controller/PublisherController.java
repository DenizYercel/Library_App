package com.denizyercel.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.denizyercel.libraryapp.entity.Publisher;
import com.denizyercel.libraryapp.service.PublisherService;

@Controller
public class PublisherController {
	
	@Autowired
	private PublisherService publisherService;

	@GetMapping("/publisherList")
	public String publisherList(Model model) {
		model.addAttribute("listPublisher", publisherService.findAll());
		return "publisher_list";
	}

	@GetMapping("/showNewPublisherForm")
	public String showNewPublisherForm(Model model) {
		Publisher publisher = new Publisher();
		model.addAttribute("publisher", publisher);
		return "new_publisher";
	}

	@PostMapping("/savePublisher")
	public String savePublisher(@ModelAttribute("publisher") Publisher publisher) {
		
		if (publisher.getPublisherName()=="" || publisher.getPublisherName()==null) {
			return "redirect:/showNewPublisherForm?error=true";
		}else {
			publisherService.save(publisher);
			return "redirect:/publisherList";
		}
		

	}

	@GetMapping("/showPublisherFormForUpdate/{id}")
	public String showPublisherFormForUpdate(@PathVariable(value = "id") Long id, Model model) {
		Publisher publisher = publisherService.findById(id);
		model.addAttribute("publisher", publisher);
		return "update_publisher";
	}

	@GetMapping("/deletePublisher/{id}")
	public String deletePublisher(@PathVariable(value = "id"  ) Long id) {
		this.publisherService.deleteById(id);
		return "redirect:/publisherList";
	}
}
