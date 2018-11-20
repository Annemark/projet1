package fr.dawan.spring.main;

import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.xml.internal.resolver.Catalog;

import fr.dawan.spring.beans.Catalogue;
import fr.dawan.spring.beans.Contact;
import fr.dawan.spring.beans.Formation;
import fr.dawan.spring.beans.Stagiaire;
import fr.dawan.spring.utils.IncrementalNumberGenerator;
import fr.dawan.spring.utils.RandomNumberGenerator;

public class ProgrammePrincipal {

	public static void main(String[] args) {
		/**
		 * 序主要是通过Spring容器来访问容器中的Bean，ApplicationContext是Spring容器最常用的接口，该接口有如下两个实现类：

			ClassPathXmlApplicationContext: 从类加载路径下搜索配置文件，并根据配置文件来创建Spring容器。
			FileSystemXmlApplicationContext: 从文件系统的相对路径或绝对路径下去搜索配置文件，并根据配置文件来创建Spring容器。
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//recuperer la configuration dans beans.xml, le constructeur est applé ici, la formation est créé ici 
		//从类加载路径下搜索配置文件，并根据配置文件来创建Spring容器。
		
		System.out.println("Appel du getBean");
		
		Formation formation = (Formation) context.getBean("springmvc");//Add cast
		System.out.println(formation);
		
		Formation formation2 = context.getBean("springmvc", Formation.class);
		System.out.println(formation2);
		
		
		formation.setPrix(3000);
		System.out.println(formation2);
		
		Formation formation3 = context.getBean("jpa1", Formation.class);
		System.out.println(formation3);
		
		Formation formation4 = context.getBean("jseinit", Formation.class);
		System.out.println(formation4);
		
		Formation formation5 = context.getBean("jseappro", Formation.class);
		System.out.println(formation5);
		
		Formation formation6 = context.getBean("uml", Formation.class);
		System.out.println(formation6);
		
		
		Contact contact1 = context.getBean("contact1", Contact.class);
		System.out.println(contact1);
		
		Stagiaire stagiaire1 = context.getBean("stagiaire1", Stagiaire.class);
		System.out.println(stagiaire1);
		
		Stagiaire stagiaire2= context.getBean("stagiaire2", Stagiaire.class);
		System.out.println(stagiaire2);
		
		Stagiaire stagiaire3= context.getBean("stagiaire3", Stagiaire.class);
		System.out.println(stagiaire3);
		Stagiaire stagiaire4= context.getBean("stagiaire4", Stagiaire.class);
		System.out.println(stagiaire4);
		Stagiaire stagiaire5= context.getBean("stagiaire5", Stagiaire.class);
		System.out.println(stagiaire5);
		
//	
//		RandomNumberGenerator random = new RandomNumberGenerator();//instancier chaque fois on demarre, pas top.
//      IncrementalNumberGenerator random = new IncrementalNumberGenerator();
//		random.setCompteur(1000);
//		random.setPas(3);
//	    String code = random.computeNumber(stagiaire2);
//		System.out.println(code);
//		
//		RandomNumberGenerator random = context.getBean("generator", RandomNumberGenerator.class);
//	    String code = random.computeNumber(stagiaire1);
//		System.out.println(code);
		
		//System.out.println();
		System.out.println("\nRECUPERATION DU CATALOGUE");
		Catalogue cat = context.getBean("catalogue1", Catalogue.class);
			for(Formation formationItem : cat.getListeFormation()) {
				System.out.println(formationItem);
			}
		
		// pas d'acces direct à ce bean : ne marche pas 
//			Formation formationGit = context.getBean("Git", Formation.class);
//			System.out.println(formationGit);
//		
			
		
		System.out.println("\nRECUPERATION DU CATALOGUE 2");
		Catalogue cat2 = context.getBean("catalogue2", Catalogue.class);// ICI IL FAUT PENSER CHANGER A "catalogue2"!!!!!!!!
			for(Formation formationItem : cat2.getListeFormation()) {
				System.out.println(formationItem);
			}
			
		System.out.println("\nRECUPERATION DU CONTACT 2");	
		Contact contact2 = context.getBean("contact2", Contact.class);
			for (String adresse : contact2.getListeAdresse()) {
				System.out.println(adresse);		
			}
			
		System.out.println("\nRECUPERATION DU Catalogue3");	
		Catalogue cat3 = context.getBean("catalogue3", Catalogue.class);
		Set<Entry<Integer,String>> setFormation = cat3.getFormations().entrySet();
		for (Entry <Integer, String> entree : cat3.getFormations().entrySet()) {	
			System.out.println(entree);		
		}
		
		Stagiaire stagiaireFormateur = context.getBean("stagiaireFormateur", Stagiaire.class);
		for (String adresse : stagiaireFormateur.getListeAdresse()) {
			System.out.println(adresse);
			
		}
					
	}

}
