package hh.Bookstore;

import hh.Bookstore.domain.Book;
import hh.Bookstore.domain.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository bookRepository) { 
		return (args) -> {
			System.out.println("save a couple of books");
			Book book1 = new Book("Erlione's Life", "Susan Lynn", 2002, "12453-1", 19.99);
			Book book2 = new Book("A Student's Cookbook", "Arthur Smith", 2014, "4589274-21", 14.99);
			bookRepository.save(book1);
			bookRepository.save(book2);	
			
			System.out.println("fetch all books");
			for (Book book : bookRepository.findAll()) {
				System.out.println(book.toString());
			}
		};
	}
}
