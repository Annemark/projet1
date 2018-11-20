package fr.dawan.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import fr.dawan.spring.utils.NumberGenerator;


public class Stagiaire extends Contact {
	
    @Autowired
    @Qualifier("randomGenerator")
	private NumberGenerator generator;
	
//	public RandomNumberGenerator getGenerator() {
//		return generator;
//	}
//
//	public void setGenerator(RandomNumberGenerator generator) {
//		this.generator = generator;
//	}

	private String codeStagiaire;

	public String getCodeStagiaire() {
		return codeStagiaire;
	}

	public void setCodeStagiaire(String codeStagiaire) {
		this.codeStagiaire = codeStagiaire;
	}

	
	public void init() {
		setCodeStagiaire(generator.computeNumber(this));
	}
	
	@Override
	public String toString() {
		return "Stagiaire [codeStagiaire=" + codeStagiaire + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ "]";
	}


}
