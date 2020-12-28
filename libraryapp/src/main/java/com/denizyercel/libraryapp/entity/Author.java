package com.denizyercel.libraryapp.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="writer")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name = "author_name")
	private String authorName;
	
	@Column(name = "author_description")
	private String authorDescription;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorDescription() {
		return authorDescription;
	}
	public void setAuthorDescription(String authorDescription) {
		this.authorDescription = authorDescription;
	}
	
	
}
