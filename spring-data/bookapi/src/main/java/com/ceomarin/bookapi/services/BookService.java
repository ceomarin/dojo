package com.ceomarin.bookapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ceomarin.bookapi.models.Book;
import com.ceomarin.bookapi.repositories.BookRepository;

@Service
public class BookService {
	// Agregando el book al repositorio como una dependencia
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// Devolviendo todos los libros.
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}

	// Creando un libro.
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	// Obteniendo la información de un libro
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	// actualizar la información de un libro
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			Book bookToUpdate = optionalBook.get();
			bookToUpdate.setTitle(title);
			bookToUpdate.setDescription(desc);
			bookToUpdate.setLanguage(lang);
			bookToUpdate.setNumberOfPages(numOfPages);

			bookRepository.save(bookToUpdate);
			return bookToUpdate;
		} else {
			return null;
		}
	}
	
	
	// actualizar la información de un libro
	public Book updateBook(Book book) {
		Optional<Book> optionalBook = bookRepository.findById(book.getId());
		if (optionalBook.isPresent()) {
			Book bookToUpdate = optionalBook.get();
			bookToUpdate.setTitle(book.getTitle());
			bookToUpdate.setDescription(book.getDescription());
			bookToUpdate.setLanguage(book.getLanguage());
			bookToUpdate.setNumberOfPages(book.getNumberOfPages());

			bookRepository.save(bookToUpdate);
			return bookToUpdate;
		} else {
			return null;
		}
	}

	// Eliminar un libro
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
}
