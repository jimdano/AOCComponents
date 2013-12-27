package fr.istic.aoc.components.api;

public interface IAfficheur {
	
	public static final int TEMPO = 0;
	public static final int MEASURE = 1;

	/**
	 * Turns ON the LED represented by the given id
	 * @param id a LED id
	 */
	void allumerLed(int id);
	
	/**
	 * Turns OFF the LED represented by the given id
	 * @param id a LED id
	 */
	void eteindreLed(int id);
	
	/**
	 * Prints the given integer on the hardware's display
	 */
	void afficherTempo(int value);
}
