package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String title;
	private String Author;
	private String content;
	private Integer pages;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Books(Integer id, String title, String author, String content, Integer pages) {
		super();
		this.id = id;
		this.title = title;
		Author = author;
		this.content = content;
		this.pages = pages;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", Author=" + Author + ", content=" + content + ", pages="
				+ pages + "]";
	}

}
