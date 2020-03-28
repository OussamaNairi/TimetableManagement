package com.essat.controlleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class AddEnseignant
 */
public class AddEnseignant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEnseignant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String cnss=request.getParameter("cnss");
		String cnprs=request.getParameter("cnprs");
		int nbEnfants=Integer.parseInt(request.getParameter("nbEnfants"));
		String diplome=request.getParameter("diplome");
		String rib_IBAN=request.getParameter("rib_IBAN");
		String img=request.getParameter("img");
		String poste=request.getParameter("poste");
		String etablissementOrigine=request.getParameter("etablissementOrigine");
		
		
		request.getRequestDispatcher("Principale").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
