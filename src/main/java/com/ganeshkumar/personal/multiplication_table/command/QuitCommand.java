package com.ganeshkumar.personal.multiplication_table.command;

/**
 * @author Ganesh Kumar. Sankaramanchi
 *
 */

public class QuitCommand implements Command {

	@Override
	public void execute() {
		System.exit(0);
	}
}
