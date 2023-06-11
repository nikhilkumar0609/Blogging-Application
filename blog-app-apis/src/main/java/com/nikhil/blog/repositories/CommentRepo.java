package com.nikhil.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhil.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment	, Integer> {

}
