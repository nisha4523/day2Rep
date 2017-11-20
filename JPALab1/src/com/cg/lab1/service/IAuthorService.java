package com.cg.lab1.service;

import com.cg.lab1.entity.Author;

public interface IAuthorService {

	Author findAuthorById(int id);

	void removeAuthor(Author author);

	void updateAuthor(Author author);

	void addAuthor(Author author);

}
