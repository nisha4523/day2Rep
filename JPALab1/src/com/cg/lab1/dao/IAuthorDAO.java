package com.cg.lab1.dao;

import com.cg.lab1.entity.Author;

public interface IAuthorDAO {

	Author getAuthorById(int id);

	void addAuthor(Author author);

	void removeAuthor(Author author);

	void updateAuthor(Author author);

	void beginTransaction();

	void commitTransaction();

}
