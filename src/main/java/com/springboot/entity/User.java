package com.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "myUser")
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	private int id;
	private String name , gender , Address;  

}
