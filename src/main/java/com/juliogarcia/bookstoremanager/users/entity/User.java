package com.juliogarcia.bookstoremanager.users.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.juliogarcia.bookstoremanager.book.entity.Book;
import com.juliogarcia.bookstoremanager.entity.Auditable;
import com.juliogarcia.bookstoremanager.users.enums.Gender;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class User extends Auditable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(nullable = false)
	private String Name;

	@Column(nullable = false)
	private int age;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 20)
	private Gender gender;

	@Column(nullable = false, unique = true, length = 100)
	private String email;

	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDate birthDate;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Book> books;
}
