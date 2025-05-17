package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BookEntity;
import com.example.demo.repository.BookRepo;

@RestController
public class BookController {
	@Autowired
	private BookRepo repo;

	@PostMapping("/add")
	public BookEntity addbook(@RequestBody BookEntity boo) {
		try {
			repo.save(boo);
			return boo;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@PutMapping("/update")
	public BookEntity updatebook(@RequestBody BookEntity boo) {

		try {
			repo.save(boo);
			return boo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@GetMapping("/get")
	public List<BookEntity> getBook() {

		try {
			return repo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable int id) {
		try {
			repo.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
