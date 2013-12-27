package fr.istic.aoc.components.api;

import fr.istic.aoc.components.command.ICommand;

public interface IHorloge {

	/**
	 * Execute the given command every 'delay' seconds
	 * @param cmd an ICommand object to be periodically executed
	 * @param delay before the first execution
	 * @param period between each execution
	 */
	void activerPeriodiquement(ICommand cmd, int delay, int period);
	
	/**
	 * Execute the given command after 'delay' seconds.
	 * The command will only be executed one and only time.
	 * @param cmd an ICommand object to be executed
	 * @param delay before the command execution
	 */
	void activerApresDelai(ICommand cmd, int delay);
	
	/**
	 * Kill the command in the clock scheduler
	 * @param cmd the command to kill
	 */
	void desactiver(ICommand cmd);
}
