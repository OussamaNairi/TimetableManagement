package com.essat.model;

import java.util.ArrayList;

public class Matiere {
	private int id_Matiere;
	private String nom;
	private int coefficient;
	private int maxEtudiant;
	private int volumeHoraire;
	private ArrayList<Enseignant> enseignants;
	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Matiere(String nom, int coefficient, int maxEtudiant, int volumeHoraire) {
		super();
		this.nom = nom;
		this.coefficient = coefficient;
		this.maxEtudiant = maxEtudiant;
		this.volumeHoraire = volumeHoraire;
	}

	public Matiere(String nom, int coefficient, int maxEtudiant, int volumeHoraire, ArrayList<Enseignant> enseignants) {
		super();
		this.nom = nom;
		this.coefficient = coefficient;
		this.maxEtudiant = maxEtudiant;
		this.volumeHoraire = volumeHoraire;
		this.enseignants = enseignants;
	}
	public int getId_Matiere() {
		return id_Matiere;
	}
	public void setId_Matiere(int id_Matiere) {
		this.id_Matiere = id_Matiere;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	public int getMaxEtudiant() {
		return maxEtudiant;
	}
	public void setMaxEtudiant(int maxEtudiant) {
		this.maxEtudiant = maxEtudiant;
	}
	public int getVolumeHoraire() {
		return volumeHoraire;
	}
	public void setVolumeHoraire(int volumeHoraire) {
		this.volumeHoraire = volumeHoraire;
	}
	public ArrayList<Enseignant> getEnseignants() {
		return enseignants;
	}
	public void setEnseignants(ArrayList<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}
	@Override
	public String toString() {
		return "Matiere [nom=" + nom + "]";
	}


}
