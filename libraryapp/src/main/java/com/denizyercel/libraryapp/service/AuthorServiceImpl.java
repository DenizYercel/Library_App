package com.denizyercel.libraryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denizyercel.libraryapp.dao.AuthorRepository;
import com.denizyercel.libraryapp.entity.Author;

@Service
public class AuthorServiceImpl implements AuthorService{
	
	@Autowired
	AuthorRepository authorRepository;

	@Override
	public List<Author> findAll() {
		return authorRepository.findAll();
	}

	@Override
	public Author findById(Long id) {
		Optional<Author> result = authorRepository.findById(id);
		Author writer =null;
		if (result.isPresent())
			writer = result.get();
		else
			throw new RuntimeException("Yazar bulunamadı. ID: " + id);
		return writer;
		
	}

	@Override
	public void save(Author writer) {
		authorRepository.save(writer);
		
	}

	@Override
	public void deleteById(Long id) {
		authorRepository.deleteById(id);
		
	}

	

}
