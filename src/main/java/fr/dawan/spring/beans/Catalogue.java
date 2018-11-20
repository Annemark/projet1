package fr.dawan.spring.beans;

import java.util.List;
import java.util.Map;

public class Catalogue {
	private List<Formation> listeFormation;
	private Map<Integer,String> formations;
	

	public List<Formation> getListeFormation() {
		return listeFormation;
	}

	public void setListeFormation(List<Formation> listeFormation) {
		this.listeFormation = listeFormation;
	}

	public Map<Integer,String> getFormations() {
		return formations;
	}

	public void setFormations(Map<Integer,String> formations) {
		this.formations = formations;
	}
		
}
