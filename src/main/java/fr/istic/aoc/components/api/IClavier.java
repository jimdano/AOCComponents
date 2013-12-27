package fr.istic.aoc.components.api;

public interface IClavier {

	public static final int START = 0;
	public static final int STOP = 1;
	public static final int INC = 2;
	public static final int DEC = 3;
	
	/**
	 * @param id an id that represents a button
	 * @return true if the button is pressed; false otherwise
	 */
	boolean touchePressee(int id);
}
