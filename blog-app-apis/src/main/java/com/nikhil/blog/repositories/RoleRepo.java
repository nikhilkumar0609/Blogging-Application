package com.nikhil.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhil.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}