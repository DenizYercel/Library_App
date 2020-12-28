package com.denizyercel.libraryapp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="book_name")
	private String name;
	
	@Column(name="book_subname")
	private String subName;
	
	@Column(name="book_serial")
	private String serialName;
	
	@Column(name="book_author")
	private String bookAuthor;
	
	@Column(name="book_publisher_name")
	private String bookPublisherName;
	
	@Column(name="book_isbn")
	private String isbnNo;
	
	@Column(name="book_description")
	private String description;

	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	public String getSerialName() {
		return serialName;
	}
	public void setSerialName(String serialName) {
		this.serialName = serialName;
	}
	public String getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(String isbnNo) {
		this.isbnNo = isbnNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisherName() {
		return bookPublisherName;
	}
	public void setBookPublisherName(String bookPublisherName) {
		this.bookPublisherName = bookPublisherName;
	}
	
	
	

}
