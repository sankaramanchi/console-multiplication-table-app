package com.ganeshkumar.personal.multiplication_table.entity;

import java.util.ArrayList;
import java.util.List;

import com.ganeshkumar.personal.multiplication_table.exception.TableNotExistException;

/**
 * @author Ganesh Kumar. Sankaramanchi
 *
 */

public class Table {

	private int width;
	private int height;
	private int TABLE[][] = null;
	private List<String> tableData = null;
	private int heightWidth = 0;
	private int productWidth = 0;

	public Table(int w, int h) {
		this.width = w;
		this.height = h;
		heightWidth = String.valueOf(height).length();
		productWidth = String.valueOf(height * width).length();
		init();
	}

	private void init() {
		TABLE = null;
		TABLE = new int[height][width];
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				TABLE[i][j] = (i+1)*(j+1);
			}
		}
		
		tableData = null;
		tableData = new ArrayList<>();
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("*");
		sb2.append(String.format("%1$"+(heightWidth+1)+ "s", ""));
		for(int l = 0; l < width; l++) {
			sb2.append("|"+String.format("%1$"+productWidth+ "s", String.valueOf(l+1)));
		}
		sb2.append("|");
		tableData.add(sb2.toString());
		
		StringBuilder hor2 = new StringBuilder();
		for(int m=0;m<sb2.toString().length();m++) {
			hor2.append("=");
		}
		tableData.add(hor2.toString());
		
		for(int k = 0; k < height; k++) {
			StringBuilder sb = new StringBuilder();
			sb.append(String.format("%1$"+heightWidth+ "s", String.valueOf(k+1))+"->");
			for(int l = 0; l < width; l++) {
				sb.append("|"+String.format("%1$"+productWidth+ "s", String.valueOf(TABLE[k][l])));
			}
			sb.append("|");
			StringBuilder hor = new StringBuilder();
			for(int m=0;m<sb.toString().length();m++) {
				hor.append("-");
			}
			if(k!=0) {
				tableData.add(hor.toString());
			}
			tableData.add(sb.toString());
		}
	}
	
	public void render() {
		if(TABLE == null || tableData.size() <= 0) {
			throw new TableNotExistException();
		}
		tableData.forEach(System.out::println);
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public int[][] getTABLE() {
		return TABLE;
	}
	
	public List<String> getTableData() {
		return tableData;
	}

}
