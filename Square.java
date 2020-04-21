package com.sapient.shapes;

public class Square {
	
	private int length;
	
	public Square(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}
	
	public int calculateArea() {

		return length*length;
	
	}
	
}
