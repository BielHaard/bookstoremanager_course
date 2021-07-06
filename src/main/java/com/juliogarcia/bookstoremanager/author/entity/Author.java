package com.juliogarcia.bookstoremanager.author.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.juliogarcia.bookstoremanager.book.entity.Book;
import com.juliogarcia.bookstoremanager.entity.Auditable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Author extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = true, unique = true)
	private String nome;

	@Column(columnDefinition = "integer default 0")
	private int age;

	@OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
	private List<Book> books;
}
