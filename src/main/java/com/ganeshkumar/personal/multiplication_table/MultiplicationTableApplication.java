package com.ganeshkumar.personal.multiplication_table;

import java.util.Scanner;

import com.ganeshkumar.personal.multiplication_table.command.Command;
import com.ganeshkumar.personal.multiplication_table.command.CommandFactory;
import com.ganeshkumar.personal.multiplication_table.command.CreateTableCommand;
import com.ganeshkumar.personal.multiplication_table.command.QuitCommand;
import com.ganeshkumar.personal.multiplication_table.entity.Table;
import com.ganeshkumar.personal.multiplication_table.exception.InvalidCommandException;
import com.ganeshkumar.personal.multiplication_table.exception.TableNotExistException;

/**
 * @author Ganesh Kumar. Sankaramanchi
 *
 */

public class MultiplicationTableApplication {

	private static Scanner scanner;
	private static CommandFactory commandFactory;
	private static Table table;

    public static void main( String[] args ) {
    	scanner = new Scanner(System.in);
    	commandFactory = new CommandFactory();

    	System.out.println("enter command: ");
		while (true) {
			processCommand(scanner.nextLine().trim());
			System.out.println("\nenter command: ");
        }
    }

    public static void processCommand(String givenCommand) {
    	Command command = null;
    	try {
    		command = commandFactory.getCommand(givenCommand);
    		if (command instanceof QuitCommand) {        		
            scanner.close();
        		command.execute();
            }
    		if (command instanceof CreateTableCommand) {
        		command.execute();
        		table = ((CreateTableCommand) command).getCanvas();
            }
    		table.render();
    	}catch(InvalidCommandException | TableNotExistException e) {
    		System.out.println(e.getMessage());
    	}
    }
}
