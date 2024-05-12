package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Books;
import com.example.demo.Repository.BookRepo;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	BookRepo Bookrepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
       Books book =new Books();
       book.setTitle("Title 1");
       book.setContent("This is the content of 1st book");
       
       Books book1 =new Books();
       book1.setTitle("Title 2");
       book1.setContent("This is the content of 2nd book");
       
       this.Bookrepo.save(book);
       this.Bookrepo.save(book1);
       
		
	}

}
