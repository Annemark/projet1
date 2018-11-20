package fr.dawan.spring.beans;

import java.util.List;

public class Contact {
	private String nom;
	private String prenom;
	private List<String> listeAdresse;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Contact [nom=" + nom + ", prenom=" + prenom + "]";
	}
	public List<String> getListeAdresse() {
		return listeAdresse;
	}
	public void setListeAdresse(List<String> listeAdresse) {
		this.listeAdresse = listeAdresse;
	}

	
}
