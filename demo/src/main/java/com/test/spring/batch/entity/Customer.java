package com.test.spring.batch.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String contact;
	private String country;
	private String dob;


}
