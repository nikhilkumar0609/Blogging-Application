package com.nikhil.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhil.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}