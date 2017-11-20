package com.cg.lab2.service;

import java.util.List;

import com.cg.lab2.entity.Author;
import com.cg.lab2.entity.Book;

public interface ILab2Service {

	List<Book> getAllBooks();

	List<Book> getAuthorBooks(Author author);

	List<Book> getPriceRangeBooks(int low, int high);

	List<String> getAuthorById(int id);

}
