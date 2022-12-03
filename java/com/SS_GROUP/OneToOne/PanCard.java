package com.SS_GROUP.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "PANCARD")
public class PanCard {
	@javax.persistence.Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name ="gen", strategy = "foreign",parameters = @Parameter(name="property",value="Person"))
	private int Id;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Person Person;
	public Person getPerson() {
		return Person;
	}

	public void setPerson(Person person) {
		Person = person;
	}

	

	public PanCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
}
