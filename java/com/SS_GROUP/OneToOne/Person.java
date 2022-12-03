package com.SS_GROUP.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {
	@javax.persistence.Id
	@Column
	private int Id;
	@Column
	private String FirstName;
	@Column
	private String LastName;
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}
