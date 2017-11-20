package com.cg.lab1.client;

import com.cg.lab1.entity.Author;
import com.cg.lab1.service.AuthorServiceImpl;

public class Client 
{

	public static void main(String[] args)
	{

		AuthorServiceImpl service = new AuthorServiceImpl();
		
		Author author = new Author();
		author.setAuthorId(100);
		author.setFirstName("Vinod");
		author.setMiddleName(" kumar");
		author.setLastName(" Gupta");
		author.setPhoneNo("1234567890");
		service.addAuthor(author);
		
		//at this breakpoint, we have added one record to table
		author = service.findAuthorById(100);
		System.out.println("ID:"+author.getAuthorId());
		System.out.println("Name: "+author.getFirstName()+author.getMiddleName()+author.getLastName()
				+"\nMobile: "+author.getPhoneNo());
		
		author.setPhoneNo("1111222233");
		service.updateAuthor(author);
		
		//at this breakpoint, we have updated record added in first section
		author = service.findAuthorById(100);
		System.out.println("ID:"+author.getAuthorId());
		System.out.println("Name: "+author.getFirstName()+author.getMiddleName()+author.getLastName()
				+"\nMobile: "+author.getPhoneNo());
		
		//at this breakpoint, record is removed from table
		service.removeAuthor(author);
		System.out.println("End of program...");
		
	}
}
