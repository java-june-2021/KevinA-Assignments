package com.kevin.books.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Size(min = 5, max = 200)
	private String title;
	@Size(min = 3, max = 40)
	private String language;
	@Size(min = 5, max = 200)
	private String description;
	@Min(100)
	private Integer numOfPages;
	// This will not allow the createdAt column to be updated after creation
//	@Column(updatable=false)
//	private Date createdAt;
//	private Date updatedAt;
	
	public Book() {
		
	}
	public Book(String title, String desc, String lang, int pages) {
        this.title = title;
        this.description = desc;
        this.language = lang;
        this.numOfPages = pages;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getNumOfPages() {
		return numOfPages;
	}
	public void setNumOfPages(Integer numOfPages) {
		this.numOfPages = numOfPages;
	}
	
	
//	@PrePersist
//	protected void onCreate() {
//		this.createdAt = new Date();
//	}
//	
//	@PreUpdate
//	protected void onUpdate() {
//		this.updatedAt = new Date();
//	}
}