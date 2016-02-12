package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="account")
public class Account {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int id;
@ManyToOne
@JsonIgnore
Book book;


@Column
String status;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public Book getBook() {
	return book;
}


public void setBook(Book book) {
	this.book = book;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}

}
