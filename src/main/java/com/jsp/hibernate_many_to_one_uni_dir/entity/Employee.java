package com.jsp.hibernate_many_to_one_uni_dir.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	
	@ManyToOne
	private Company company;
	

}
