package com.denizyercel.libraryapp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="publisher")
public class Publisher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="publisher_name")
	private String publisherName;
	
	@Column(name="publisher_description")
	private String publisherDescription;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherDescription() {
		return publisherDescription;
	}

	public void setPublisherDescription(String publisherDescription) {
		this.publisherDescription = publisherDescription;
	}

	

}
