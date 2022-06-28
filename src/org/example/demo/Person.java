package org.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String addr;

	@OneToOne
	private Passport ps;
	public Passport getPs() {
		return ps;
	}
	public void setPs(Passport ps) {
		this.ps = ps;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
