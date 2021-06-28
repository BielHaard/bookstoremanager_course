package com.juliogarcia.bookstoremanager.publishers.entity;

import java.time.LocalDate;
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
public class Publisher extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = true, unique = true)
	private String name;

	@Column(nullable = false, unique = true, length = 100)
	private String code;

	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDate foundationDate;


	@OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
	private List<Book> books;
}
