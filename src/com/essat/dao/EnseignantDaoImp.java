package com.essat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import com.essat.model.Enseignant;

public class EnseignantDaoImp implements IEnseignantDao{
	
	
	private Connection cnx;
	public EnseignantDaoImp() {
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/geneticalgorithm?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	@Override
	public List<Enseignant> getAllEnseignants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enseignant getEnseignant(int id_Enseignant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addLivre(Enseignant e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEnseignant(Enseignant e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEnseignant(int id_Enseignant) {
		// TODO Auto-generated method stub
		
	}

}
