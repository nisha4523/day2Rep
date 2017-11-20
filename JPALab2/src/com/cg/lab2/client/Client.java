package com.cg.lab2.client;
import com.cg.lab2.entity.Author;
import com.cg.lab2.entity.Book;
import com.cg.lab2.service.Lab2ServiceImpl;

public class Client 
{
  public static void main(String args[]) throws Exception
  {
		
	Lab2ServiceImpl service=new Lab2ServiceImpl();
	Author author=new Author();
	author.setName("Author 1");
	
	System.out.println("************Listing All books*************");
	for(Book book:service.getAllBooks()) 
		System.out.println(book);
	
	System.out.println("************Listing book written by Danny Coward*************");
	for(Book book:service.getAuthorBooks(author) ) 
		System.out.println(book);
	
	System.out.println("************Listing book in range 400 to 40000*************");
	for(Book book:service.getPriceRangeBooks(400,40000) ) 
		System.out.println(book);
	
	System.out.println("************Listing authors of book with ISBN=011*************");
	for(String a:service.getAuthorById(11)) 
		System.out.println(a);
  }
}
