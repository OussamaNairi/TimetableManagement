package com.essat.model;

public class Seance {
private int id_Seance;
private String nom;
public Seance() {
	super();
	// TODO Auto-generated constructor stub
}
public Seance(String nom) {
	super();
	this.nom = nom;
}
public int getId_Seance() {
	return id_Seance;
}
public void setId_Seance(int id_Seance) {
	this.id_Seance = id_Seance;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}


}
