package com.example.liberary.liberary_management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.liberary.liberary_management.entity.Book;

import jakarta.persistence.Id;

public interface BookRepository extends JpaRepository<Book, Long> {

	Optional<Book> findById(Long id);

	
}
