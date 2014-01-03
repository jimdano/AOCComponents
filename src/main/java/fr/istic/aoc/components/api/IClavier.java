package fr.istic.aoc.components.api;

/**
 * 
 * @author jimmy & Anthony
 * classe représentant le clavier, les différents boutons qui sont pressés
 */
public interface IClavier {

	/**
	 * les différents boutons
	 */
	public static final int START = 0;
	public static final int STOP = 1;
	public static final int INC = 2;
	public static final int DEC = 3;
	
	/**
	 * @param id l'id du bouton pressé
	 * @return true si pressé; false sinon
	 */
	boolean touchePressee(int id);
}
