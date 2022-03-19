package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
	@GeneratedValue
	private long id;
	private String nom;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom+ "]";
	}
	public Client(String nom, Date dateN) {
		super();
		this.nom = nom;
	}
	public Client() {
		super();
	}
	
}
