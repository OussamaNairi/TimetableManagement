package com.essat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import com.essat.model.Salle;

public class SalleDaoImp implements ISalleDao{
	private Connection cnx;
	public SalleDaoImp() {
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/geneticalgorithm?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	@Override
	public List<Salle> getAllSalles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salle getSalle(int id_Salle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSalle(Salle s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSalle(Salle s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSalle(int id_Salle) {
		// TODO Auto-generated method stub
		
	}

}
