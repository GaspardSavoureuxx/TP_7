package fr.doranco.employe;

import java.util.Date;

public class Manutentionnaire extends Employe {
	
	protected int heures;

	public Manutentionnaire(String nom, String prenom, Date dateNaissance, String type, int heures) {
		super(nom, prenom, dateNaissance, type);
		this.heures = heures;
		
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}

	public double calculerSalaire() {	
		 double salaire = heures * 65; 
		 return salaire;
	}
	
	
	
	

}
