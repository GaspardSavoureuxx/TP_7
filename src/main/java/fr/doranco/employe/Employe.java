package fr.doranco.employe;

import java.util.Date;

import fr.doranco.employe.enums.TypeEmploye;

public abstract class Employe {

	protected String nom;
	protected String prenom;
	protected Date dateNaissance;
	protected String type;

	public Employe() {

	}

	public Employe(String nom, String prenom, Date dateNaissance, String type) {

		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.type = type;

	}

	public String getNom() {
		return "L'employé " + nom + " " + prenom;
	}
	
	
	public double calculerSalaire() {
		getNom();
		double salaire = 0;
		return (salaire );
		// salaire.type.equals(TypeEmploye.VENTE.getValue()) ? salaire = 400 
		//		: salaire.type.equals(TypeEmploye.REPRESENTATION.getValue()) ? salaire = 800
		//			: salaire.type.equals(TypeEmploye.PRODUCTION.getValue()) ? salaire = 5*
		//				: salaire.type.equals(TypeEmploye.MAUTENTION.getValue()) ? salaire = 65*
	}

}
