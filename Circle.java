package com.sapient.shapes;

public class Circle {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public float calculateArea() {

		return (float) (3.14*radius*radius);
	
	}


}
