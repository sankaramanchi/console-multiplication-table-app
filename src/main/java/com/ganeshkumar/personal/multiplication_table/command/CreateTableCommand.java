package com.ganeshkumar.personal.multiplication_table.command;

import com.ganeshkumar.personal.multiplication_table.entity.Table;

/**
 * @author Ganesh Kumar. Sankaramanchi
 *
 */

public class CreateTableCommand implements Command {
	
	private int width;
	private int height;
	private Table table;
	
	public CreateTableCommand(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	@Override
	public void execute() {
		table = new Table(width, height);
	}
	
	public Table getCanvas() {
		return table;
	}

}
