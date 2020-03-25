package com.essat.model;

import java.util.ArrayList;

public class Departemet {
	private int id_Departement;
	private String nom;
	private ArrayList<Matiere> matieres;
	public Departemet(String nom, ArrayList<Matiere> matieres) {
		super();
		this.nom = nom;
		this.matieres = matieres;
	}
	public Departemet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_Departement() {
		return id_Departement;
	}
	public void setId_Departement(int id_Departement) {
		this.id_Departement = id_Departement;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Matiere> getMatieres() {
		return matieres;
	}
	public void setMatieres(ArrayList<Matiere> matieres) {
		this.matieres = matieres;
	}
	

}
