package fr.doranco.employe;

import java.util.Date;

import fr.doranco.employe.enums.TypeEmploye;

public class Commercial extends Employe {
	
	protected double chiffreAffaires;

	public Commercial(String nom, String prenom, Date dateNaissance, String type, double chiffreAffaires) {
		super(nom, prenom, dateNaissance, type);
		this.chiffreAffaires = chiffreAffaires;
	}
	
	
	public double calculerSalaire() {
		 double salaire = chiffreAffaires * 0.2;
		 if (type.equals(TypeEmploye.VENTE.getValue())) { salaire = salaire + 400;
		 }
		 else if (type.equals(TypeEmploye.REPRESENTATION.getValue())) { salaire = salaire + 800;
		 }
		 return salaire;
		 
	}
		 
	
	

}
