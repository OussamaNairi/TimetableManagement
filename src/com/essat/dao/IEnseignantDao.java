package com.essat.dao;

import java.util.List;

import com.essat.model.Enseignant;


public interface IEnseignantDao {
	
	public List<Enseignant> getAllEnseignants();
	public Enseignant getEnseignant(int id_Enseignant);
	public void addLivre(Enseignant e);
	public void updateEnseignant(Enseignant e);
	public void deleteEnseignant(int id_Enseignant);

}
