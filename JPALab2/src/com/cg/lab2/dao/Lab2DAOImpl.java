package com.cg.lab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.lab2.entity.Author;
import com.cg.lab2.entity.Book;

public class Lab2DAOImpl implements ILab2DAO 
{
	private EntityManager entityManager;
	public Lab2DAOImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public List<Book> getAllBooks() 
	{
		TypedQuery<Book> query = entityManager.createNamedQuery("getAllBooks",Book.class);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	@Override
	public List<Book> getAuthorBooks(Author author) {
		 
		String qStr = "SELECT b FROM Author a JOIN a.books b WHERE a.name=:paName";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("paName", author.getName());
		List<Book> bookList = query.getResultList();
		return bookList;
	}
	
	@Override
	public List<Book> getPriceRangeBooks(int low,int high)
	{
		String qStr = "SELECT b FROM Book b WHERE b.price between :low and :high";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<Book> bookList = query.getResultList();
		return bookList;
	}
	
	@Override
	public List<String> getAuthorById(int id)
	{
		String qStr = "SELECT a.name FROM Author a JOIN a.books b WHERE b.ISBN=:pId";
		Query query = entityManager.createQuery(qStr);
		query.setParameter("pId", id);
		List<String> authList = query.getResultList();
		return authList;
		
		/*Author a = entityManager.find(Author.class, id);
		return a;*/
	}
}



































