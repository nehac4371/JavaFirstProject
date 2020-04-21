package com.sapient.shapes;

public class Triangle {
	
	private int sides;
	
	public Triangle(int sides) {
		this.sides = sides;
	}

	public int getSides() {
		return sides;
	}
	
	public float calculateArea() {

		return (float) (0.433*sides*sides);
	
	}
}
