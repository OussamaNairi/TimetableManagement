package com.essat.dao;

import java.util.List;

import com.essat.model.Matiere;



public interface IMatiereDao {
	public List<Matiere> getAllMatieres();
	public Matiere getEnseignant(int id_Matiere);
	public void addLivre(Matiere m);
	public void updateMatiere(Matiere m);
	public void deleteMatiere(int id_Matiere);

}
