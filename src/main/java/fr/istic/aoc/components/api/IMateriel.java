package fr.istic.aoc.components.api;

/**
 * @author jimmy & Anthony 
 * Représente la classe qui a les différents composants de l'application
 */
public interface IMateriel {

	IClavier getClavier();
	
	IHorloge getHorloge();
	
	IAfficheur getAfficheur();
	
	IEmetteurSonore getEmetteur();
	
	IMolette getMolette();
}
