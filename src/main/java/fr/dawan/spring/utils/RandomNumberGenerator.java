package fr.dawan.spring.utils;

import fr.dawan.spring.beans.Stagiaire;

public class RandomNumberGenerator implements NumberGenerator {

	@Override
	public String computeNumber(Stagiaire stagiaire) {
		
		int random = (int)( Math.random()*1000000);	
		//Jean-Bernard Lavillier
		//DW-LAV-735638
		StringBuilder code = new StringBuilder();
		code.append("DW-");
		code.append(stagiaire.getNom().toUpperCase().substring(0,3));
		code.append("-");
		code.append(random);
		
		return code.toString();
		
//		String code = "DW-";
//		code += stagiaire.getNom().toUpperCase().substring(0,3) ;
//		code += "-";
//		code += random;
//		
//		return code;
		
	}
	
}
