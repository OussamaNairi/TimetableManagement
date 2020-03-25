package com.essat.model;

public class Salle {
	private int id_Salle;
	private String nom;
	private int capacite;
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salle(String nom, int capacite) {
		super();
		this.nom = nom;
		this.capacite = capacite;
	}
	public int getId_Salle() {
		return id_Salle;
	}
	public void setId_Salle(int id_Salle) {
		this.id_Salle = id_Salle;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	

}
