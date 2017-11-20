package com.cg.lab1.service;

import com.cg.lab1.dao.AuthorDAOImpl;
import com.cg.lab1.entity.Author;

public class AuthorServiceImpl implements IAuthorService
{
	private AuthorDAOImpl dao;

	public AuthorServiceImpl() {
		dao = new AuthorDAOImpl();
	}

	@Override
	public void addAuthor(Author author) {
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();
	}
	
	@Override
	public void updateAuthor(Author author) {
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();
	}
	
	@Override
	public void removeAuthor(Author author) {
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();
	}
	
	@Override
	public Author findAuthorById(int id) {
		//no need of transaction, as it's an read operation
		Author author  = dao.getAuthorById(id);
		return author;
	}
}




























