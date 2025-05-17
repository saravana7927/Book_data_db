package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookEntity {
	@Id
	private int book_id;
	private String title;
	private String author;
	private int isbn;
	private String publisher;
	private String published_date;
	private int price;
	private int cost_price;
	private int stock_quantity;
	private String language;
	private int edition;
	private int page_count;
	private String book_cover_image;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublished_date() {
		return published_date;
	}
	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCost_price() {
		return cost_price;
	}
	public void setCost_price(int cost_price) {
		this.cost_price = cost_price;
	}
	public int getStock_quantity() {
		return stock_quantity;
	}
	public void setStock_quantity(int stock_quantity) {
		this.stock_quantity = stock_quantity;
	}
	public String getlanguage() {
		return language;
	}
	public void setlanguage(String language) {
		this.language = language;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getPage_count() {
		return page_count;
	}
	public void setPage_count(int page_count) {
		this.page_count = page_count;
	}
	public String getBook_cover_image() {
		return book_cover_image;
	}
	public void setBook_cover_image(String book_cover_image) {
		this.book_cover_image = book_cover_image;
	}
	public BookEntity(int book_id, String title, String author, int isbn, String publisher, String published_date,
			int price, int cost_price, int stock_quantity, String language, int edition, int page_count,
			String book_cover_image) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publisher = publisher;
		this.published_date = published_date;
		this.price = price;
		this.cost_price = cost_price;
		this.stock_quantity = stock_quantity;
		this.language = language;
		this.edition = edition;
		this.page_count = page_count;
		this.book_cover_image = book_cover_image;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
