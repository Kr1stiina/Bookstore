package hh.Bookstore.domain;

import org.springframework.data.repository.CrudRepository;

import hh.Bookstore.domain.Book;
import java.util.List;


public interface BookRepository extends CrudRepository<Book, Long> {
	
	

}