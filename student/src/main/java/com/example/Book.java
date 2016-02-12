package com.example;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.*;

@Entity
@Table (name="book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@OneToMany( fetch = FetchType.EAGER, cascade=CascadeType.ALL, orphanRemoval = true)
	List<Account>acc;
	@Column
	String name;
	
	@Column
	String author;
	
	
	@Column
	String isbn;
@Column
int nop;

	public int getNop() {
	return nop;
}


public void setNop(int nop) {
	this.nop = nop;
}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<Account> getAcc() {
		return acc;
	}


	public void setAcc(List<Account> acc) {
		this.acc = acc;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	

}
