package com.hibernatejpa.prac.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;


//@Table(name="person") //since table name is same as class name we can ignore to defined it
@Data
@Entity
@NamedQuery(name="find_all_person", query="select p from Person p") //jpql use entity not table name, here Person is entity not table
public class Person {

	@Id
	@GeneratedValue
	private int id;
	
	//@Column(name="name") //since column name is same as variable name we can ignore to defined it
	private String name;
	private String location;
	private Date birthDate;

	public Person() {

	}

	public Person(String name, String location, Date birthDate) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	public Person(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}

}
