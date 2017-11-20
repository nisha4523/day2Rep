package com.cg.lab1.dao;

import javax.persistence.EntityManager;  

import com.cg.lab1.entity.Author;

public class AuthorDAOImpl implements IAuthorDAO 
{
	private EntityManager entityManager;

	public AuthorDAOImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public Author getAuthorById(int id) {
		Author author = entityManager.find(Author.class, id);
		return author;
	}
	
	@Override
	public void addAuthor(Author author) {
		entityManager.persist(author);
	}
	@Override
	public void removeAuthor(Author author) {
		entityManager.remove(author);
	}

	@Override
	public void updateAuthor(Author author) {
		entityManager.merge(author);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
}
