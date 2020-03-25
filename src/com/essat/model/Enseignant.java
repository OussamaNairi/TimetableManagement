package com.essat.model;


public class Enseignant {
	private int id_Enseignant;
	private String nom;
	private String prenom;
	private String cnss;
	private String cnprs;
	private int nbEnfants;
	private String diplome;
	private String rib_IBAN;
	private String img;
	private String poste;
	private String etablissementOrigine;
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enseignant(String nom, String prenom, String cnss, String cnprs, int nbEnfants, String diplome,
			String rib_IBAN, String img, String poste, String etablissementOrigine) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cnss = cnss;
		this.cnprs = cnprs;
		this.nbEnfants = nbEnfants;
		this.diplome = diplome;
		this.rib_IBAN = rib_IBAN;
		this.img = img;
		this.poste = poste;
		this.etablissementOrigine = etablissementOrigine;
	}
	public int getId_Enseignant() {
		return id_Enseignant;
	}
	public void setId_Enseignant(int id_Enseignant) {
		this.id_Enseignant = id_Enseignant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCnss() {
		return cnss;
	}
	public void setCnss(String cnss) {
		this.cnss = cnss;
	}
	public String getCnprs() {
		return cnprs;
	}
	public void setCnprs(String cnprs) {
		this.cnprs = cnprs;
	}
	public int getNbEnfants() {
		return nbEnfants;
	}
	public void setNbEnfants(int nbEnfants) {
		this.nbEnfants = nbEnfants;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public String getRib_IBAN() {
		return rib_IBAN;
	}
	public void setRib_IBAN(String rib_IBAN) {
		this.rib_IBAN = rib_IBAN;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public String getEtablissementOrigine() {
		return etablissementOrigine;
	}
	public void setEtablissementOrigine(String etablissementOrigine) {
		this.etablissementOrigine = etablissementOrigine;
	}
	@Override
	public String toString() {
		return "Enseignant [nom=" + nom + ", prenom=" + prenom + "]";
	}
	

}
