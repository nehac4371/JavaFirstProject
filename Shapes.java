package com.sapient.shapes;


public class Shapes {
	
	private int numberOfSides;
	private int length;

	public Shapes(int numberOfSides,int length) {
		this.numberOfSides = numberOfSides;
		this.length = length;
	}
	
	public int getNumberOfSides() {
		return numberOfSides;
	}
	
	public int getLength() {
		return length;
	}

	public void calculateShapeArea() {
		int numberOfSides = getNumberOfSides();
		int length = getLength();
		
		if (numberOfSides == 1){
			
			Circle circle = new Circle(length);
			float area = circle.calculateArea();
			System.out.println("The Area of the Circle is "+area);
				
		}else if(numberOfSides == 3){
			
			Triangle triangle = new Triangle(length);
			float area = triangle.calculateArea();
			System.out.println("The Area of the Triangle is "+area);
			
		}else if(numberOfSides == 4) {
			
			Square square = new Square(length);
			int area = square.calculateArea();
			System.out.println("The Area of the Square is "+area);
			
		}else {
			
			System.out.println("No Shapes present");
			
		}
			
		
	}

}
