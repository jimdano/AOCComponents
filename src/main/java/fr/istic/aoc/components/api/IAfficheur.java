package fr.istic.aoc.components.api;

/**
 * 
 * @author jimmy & Anthony
 * Classe représentant l'afficheur de l'application, 
 */
public interface IAfficheur {
	
	/**
	 * deux LEDS, une pour le tempo, une pour la mesure
	 */
	public static final int TEMPO = 0;
	public static final int MEASURE = 1;

	/**
	 * allule la led 
	 * @param id l'id de la led
	 */
	void allumerLed(int id);
	
	/**
	 * eteinds la led 
	 * @param id l'id de la LED
	 */
	void eteindreLed(int id);
	
	/**
	 * affiche le tempo courant
	 */
	void afficherTempo(int value);
}
