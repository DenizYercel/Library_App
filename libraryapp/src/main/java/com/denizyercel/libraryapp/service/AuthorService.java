package com.denizyercel.libraryapp.service;

import java.util.List;

import com.denizyercel.libraryapp.entity.Author;

public interface AuthorService {
	
	public List<Author> findAll();
	public Author findById(Long id);
	public void save(Author writer);
	public void deleteById(Long id);


}
