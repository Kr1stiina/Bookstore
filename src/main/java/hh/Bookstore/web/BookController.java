package hh.Bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.Bookstore.domain.BookRepository;


@Controller
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	// http://localhost:8080/index
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String indexing(Model model) {
	model.addAttribute("books", bookRepository.findAll());
	return "index";
	}



}