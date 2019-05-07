package com.bookstore.book.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.book.model.Book;
import com.bookstore.book.repository.BookRepository;

@RestController
@RequestMapping("/book")
public class BookRESTController {

	BookRepository bookRepository;
	
	public BookRESTController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@GetMapping("/get-all-books")
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
}

/*
2019-05-07 08:06:32.439  INFO 87096 --- [  restartedMain] c.bookstore.book.BookServiceApplication  : Started BookServiceApplication in 17.68 seconds (JVM running for 19.559)
2019-05-07 08:27:06.823  INFO 87096 --- [nio-8080-exec-1] o.apache.coyote.http11.Http11Processor   : Error parsing HTTP request header
 Note: further occurrences of HTTP request parsing errors will be logged at DEBUG level.

java.lang.IllegalArgumentException: Invalid character found in method name. HTTP method names must be tokens
*/