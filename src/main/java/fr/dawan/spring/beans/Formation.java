package fr.dawan.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Formation implements InitializingBean,DisposableBean {

	private String libelle;
	private int duree;
	private double prix;
	private String description;
	

	public Formation() {
		System.out.println("Formation crée");
	}

	public Formation(String libelle, int duree, double prix) {
		this();
		this.libelle = libelle;
		this.duree = duree;
		this.prix = prix;
	}
	
	
	public Formation(String libelle, int duree) {
		this();
		this.libelle = libelle;
		this.duree = duree;
	}
	

	public Formation(String libelle, String description) {
		this();
		this.libelle = libelle;
		this.description = description;
	}
	
	public Formation (double prix, String libelle, String description) {
		this();
		this.libelle = libelle;
		this.prix = prix;
		this.description = description;
	}

	public String getLibelle() {
		
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	//@Required
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Formation [libelle=" + libelle + ", duree=" + duree + ", prix=" + prix + ", description=" + description
				+ "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		 System.out.println("afterPropertiesSet : " + libelle );
		 prix = prix * 1.2;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(libelle + ": Objet détruit !");

	}

	@PostConstruct//用于指定初始化方法（用在方法上）
	public void aprescontructeur(){
		System.out.println("Après le contstructeur");
	}
	
	@PreDestroy
	public void avantDestroy() {
		System.out.println("Avnant destroy");
	}
	
	
	public void initialisationFormation() {
		System.out.println("Ici, on veut faire des trucs");
	}
		
}



