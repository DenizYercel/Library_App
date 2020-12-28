package com.denizyercel.libraryapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.denizyercel.libraryapp.entity.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long>{

}
