package com.ganeshkumar.personal.multiplication_table.exception;

/**
 * @author Ganesh Kumar. Sankaramanchi
 *
 */

@SuppressWarnings("serial")
public class InvalidCommandException extends RuntimeException {
	
	private static final String ERROR_INVALID_COMMAND = "Invalid command. please re-try again. Example of valid commands:"
			+ "\n-----------------------------------------------"
			+ "\n| T 5 4       - create multiplication table  |"
			+ "\n|             - example - T w h              |"
			+ "\n|                 T - Table command          |"
			+ "\n|                 w - width, 0 < w <= 1000   |"
			+ "\n|                 h - height 0 < h <= 1000   |"
			+ "\n| Q            - quit                        |"
			+ "\n-----------------------------------------------";
	
	public InvalidCommandException() {
		super(ERROR_INVALID_COMMAND);
	}
	
	public InvalidCommandException(String message) {
		super(message+"\n"+ERROR_INVALID_COMMAND);
	}
}
