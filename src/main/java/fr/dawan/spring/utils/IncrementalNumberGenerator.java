package fr.dawan.spring.utils;

import fr.dawan.spring.beans.Stagiaire;

public class IncrementalNumberGenerator implements NumberGenerator {

	private int compteur;
	private int pas;

	public int getCompteur() {
		return compteur;
	}

	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}

	public int getPas() {
		return pas;
	}

	public void setPas(int pas) {
		this.pas = pas;
	}

	@Override
	public String computeNumber(Stagiaire stagiaire) {
		// DW-DOE-1
		// incrémente un compteur
		// définir un pas : (ex si pas = 5, si le compteur démarre à 0, DW-DOE-5,
		// DW-DOE-10, DW-DOE-15 .....)

		StringBuilder sb = new StringBuilder();

		sb.append("DWAN-");
		sb.append(stagiaire.getNom().toUpperCase());
		sb.append("-");
		sb.append(compteur);
		compteur = compteur + pas;
		
		return sb.toString();



	}
}
