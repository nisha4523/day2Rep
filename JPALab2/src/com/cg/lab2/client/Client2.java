package com.cg.lab2.client;
 
import javax.persistence.EntityManager;  

import com.cg.lab2.dao.JPAUtil;
import com.cg.lab2.entity.Author;
import com.cg.lab2.entity.Book;


public class Client2 
{
	public static void main(String[] args) {

		EntityManager em;
		em = JPAUtil.getEntityManager();
		
		// first define few products before we place order
		Book b1 = new Book();
		b1.setISBN(012);
		b1.setTitle("BOOK 1");
		b1.setPrice(45);

		Book b2 = new Book();
		b2.setISBN(011);
		b2.setTitle("BOOK 2");
		b2.setPrice(450);
		
		Book b3 = new Book();
		b3.setISBN(013);
		b3.setTitle("BOOK 3");
		b3.setPrice(4500);
		
		Book b4 = new Book();
		b4.setISBN(014);
		b4.setTitle("BOOK 4");
		b4.setPrice(45000);

		Author a1 = new Author();
		a1.setId(1000);
		a1.setName("Author 1");
		a1.addBook(b1);
		a1.addBook(b2);
		a1.addBook(b3);
		
		Author a2 = new Author();
		a2.setId(1002);
		a2.setName("Author 2");
		a2.addBook(b1);
		a2.addBook(b3);
		a2.addBook(b4);

		em.getTransaction().begin();
		
		em.persist(a1);
		em.persist(a2);
		
		em.getTransaction().commit();
		
		System.out.println("Added author along with book details to database.");

		
		em.close();
		
	}
}
