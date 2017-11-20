package com.cg.lab2.service;

import java.util.List;

import com.cg.lab2.dao.Lab2DAOImpl;
import com.cg.lab2.entity.Author;
import com.cg.lab2.entity.Book;

public class Lab2ServiceImpl implements ILab2Service
{
	Lab2DAOImpl dao=new Lab2DAOImpl();
	@Override
	public List<Book> getAllBooks() 
	{
		return dao.getAllBooks();
	}
	@Override
	public List<Book> getAuthorBooks(Author author) 
	{
		return dao.getAuthorBooks(author);
	}
	@Override
	public List<Book> getPriceRangeBooks(int low,int high)
	{
		return dao.getPriceRangeBooks(low, high);
	}
	
	@Override
	public List<String> getAuthorById(int id)
	{
		return dao.getAuthorById(id);
	}
}
