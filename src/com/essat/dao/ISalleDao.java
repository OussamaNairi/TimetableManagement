package com.essat.dao;

import java.util.List;

import com.essat.model.Salle;



public interface ISalleDao {
	
	public List<Salle> getAllSalles();
	public Salle getSalle(int id_Salle);
	public void addSalle(Salle s);
	public void updateSalle(Salle s);
	public void deleteSalle(int id_Salle);

}
