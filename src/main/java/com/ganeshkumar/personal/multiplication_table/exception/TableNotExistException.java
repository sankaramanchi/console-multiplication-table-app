package com.ganeshkumar.personal.multiplication_table.exception;

/**
 * @author Ganesh Kumar. Sankaramanchi
 *
 */

@SuppressWarnings("serial")
public class TableNotExistException extends RuntimeException {
	
	private static final String ERROR_CANVAS_NOT_EXISTS = "Table does not exists!. create table (example T 20 4)";
	
	public TableNotExistException() {
		super(ERROR_CANVAS_NOT_EXISTS);
	}
	
	public TableNotExistException(String message) {
		super(message+"\n"+ERROR_CANVAS_NOT_EXISTS);
	}
}
