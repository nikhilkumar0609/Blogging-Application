package com.nikhil.blog.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Role {

	@Id	
	private int id;
	
	private String name;
	
}