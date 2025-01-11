package com.jsp.hibernate_many_to_one_uni_dir.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	
	@Id
	private int id;
	private String name;
	private String adreese;
	private String gstNumber;

}
