package fr.istic.aoc.components.api;

import fr.istic.aoc.components.command.ICommand;

/**
 * 
 * @author jimmy & Anthony
 * Classe d'horloge
 */
public interface IHorloge {

	/**
	 * Execute la commande toute les x seconde
	 * @param cmd la commande a s'executer périodiquement
	 * @param delay avant la première éxecution
	 * @param period la perioode entre chaque execution
	 */
	void activerPeriodiquement(ICommand cmd, int delay, int period);
	
	/**
	 * Execute la commande apres "delay" secondes
	 * @param cmd la commande a s'executer
	 * @param delay avant l'éxecution
	 */
	void activerApresDelai(ICommand cmd, int delay);
	
	/**
	 * désactive la commande cmd
	 * @param cmd la commande à stopper
	 */
	void desactiver(ICommand cmd);
}
