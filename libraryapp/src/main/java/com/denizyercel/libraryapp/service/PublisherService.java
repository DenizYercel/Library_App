package com.denizyercel.libraryapp.service;

import java.util.List;

import com.denizyercel.libraryapp.entity.Publisher;



public interface PublisherService {
	
	public List<Publisher> findAll();
	public Publisher findById(Long id);
	public void save(Publisher publisher);
	public void deleteById(Long id);


}
