package fr.doranco.employe;

import java.util.Date;

public class Technicien extends Employe {
	
	protected int unites;

	public Technicien(String nom, String prenom, Date dateNaissance, String type, int unites) {
		super(nom, prenom, dateNaissance, type);
		this.unites = unites;
	}
	
	
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}



	public double calculerSalaire() {
		 double salaire = unites * 5; 
		 return salaire;
	}
	

}
