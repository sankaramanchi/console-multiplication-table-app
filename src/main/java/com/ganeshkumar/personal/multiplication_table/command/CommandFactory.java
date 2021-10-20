package com.ganeshkumar.personal.multiplication_table.command;

import com.ganeshkumar.personal.multiplication_table.exception.InvalidCommandException;

/**
 * @author Ganesh Kumar. Sankaramanchi
 *
 */

public class CommandFactory {

	private static final String COMMAND_CREATE_TABLE = "T";
	private static final String COMMAND_QUIT = "Q";
	private static final String ELIGIBLE_COMMANDS = "TQ";

	public Command getCommand(String commandLine) throws InvalidCommandException {

		if (commandLine == null || commandLine.trim().equals(""))
			throw new InvalidCommandException();

		String commandType = String.valueOf(commandLine.charAt(0));

		if (commandLine.length() <= 0 || !ELIGIBLE_COMMANDS.contains(commandType.toUpperCase()))
			throw new InvalidCommandException();

		String[] commandParams = commandLine.split("\\s+");

		if(commandType.equalsIgnoreCase(COMMAND_CREATE_TABLE)) {
			if(commandParams.length != 3) {
				throw new InvalidCommandException();
			}
			try {
				int w = Integer.parseInt(commandParams[1]);
				int h = Integer.parseInt(commandParams[2]);
				
				if(w == 0 || h == 0)
					throw new InvalidCommandException();
				if(w > 1000 || h > 1000)
					throw new InvalidCommandException();
				
				return new CreateTableCommand(w, h);
			}catch(NumberFormatException e) {
				throw new InvalidCommandException(e.getMessage());
			}
		}

		if(commandType.equalsIgnoreCase(COMMAND_QUIT)) {
			return new QuitCommand();
		}

		return null;
	}
}
