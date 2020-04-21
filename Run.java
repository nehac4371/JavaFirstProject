package com.sapient.shapes;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberOfSides = sc.nextInt();
		int length = sc.nextInt();
		
		Shapes shapes = new Shapes(numberOfSides, length);
		shapes.calculateShapeArea();
		
		sc.close();
	}

}
