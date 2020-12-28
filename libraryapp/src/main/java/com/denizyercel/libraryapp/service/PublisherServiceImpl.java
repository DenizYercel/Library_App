package com.denizyercel.libraryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denizyercel.libraryapp.dao.PublisherRepository;
import com.denizyercel.libraryapp.entity.Publisher;

@Service
public class PublisherServiceImpl implements PublisherService{
	
	@Autowired
	PublisherRepository publisherRepository;

	@Override
	public List<Publisher> findAll() {
		
		return publisherRepository.findAll();
	}

	@Override
	public Publisher findById(Long id) {
		
		Optional<Publisher> result = publisherRepository.findById(id);
		Publisher publisher =null;
		if (result.isPresent())
			publisher = result.get();
		else
			throw new RuntimeException("Kitap evi bulunamadı. ID: " + id);
		return publisher;
	}

	@Override
	public void save(Publisher publisher) {
		publisherRepository.save(publisher);
		
	}

	@Override
	public void deleteById(Long id) {
		publisherRepository.deleteById(id);
		
	}

}
