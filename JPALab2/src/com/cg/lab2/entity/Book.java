package com.cg.lab2.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Book_tab")
@NamedQueries(@NamedQuery(name = "getAllBooks", query = "SELECT book FROM Book book"))

public class Book implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	private int ISBN;
	
	private String title;
	private int price;
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="books")
	private Set<Author> authors = new HashSet<>();
	
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price+"]";
	}
}