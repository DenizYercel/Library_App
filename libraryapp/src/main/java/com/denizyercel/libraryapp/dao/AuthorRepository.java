package com.denizyercel.libraryapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.denizyercel.libraryapp.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long >{

}
