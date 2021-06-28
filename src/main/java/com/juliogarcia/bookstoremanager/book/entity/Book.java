package com.juliogarcia.bookstoremanager.book.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.juliogarcia.bookstoremanager.author.entity.Author;
import com.juliogarcia.bookstoremanager.entity.Auditable;
import com.juliogarcia.bookstoremanager.publisher.entity.Publisher;
import com.juliogarcia.bookstoremanager.users.entity.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Book extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 100)
	private String Name;

	@Column(nullable = false)
	private String isbn;

	@Column(columnDefinition = "integer default 0")
	private  int pages;

	@Column(columnDefinition = "integer default 0")
	private int chapters;

	@ManyToOne(cascade = {CascadeType.MERGE})
	private Author author;

	@ManyToOne(cascade = {CascadeType.MERGE})
	private Publisher publisher;

	@ManyToOne(cascade = {CascadeType.MERGE})
	private User user;

}
