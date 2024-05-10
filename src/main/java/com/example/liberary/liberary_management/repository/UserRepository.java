package com.example.liberary.liberary_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.liberary.liberary_management.entity.User;

import jakarta.persistence.Id;

public interface UserRepository extends JpaRepository<User, Long> {
}