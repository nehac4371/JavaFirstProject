package com.sapient.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Command_Line1 {
	
	private int numberOfElements;
	private ArrayList<Integer> arr; 
	Scanner sc = new Scanner(System.in);
	
		
	public void setData() {
		System.out.println("Enter the number of elements:");
		this.numberOfElements = sc.nextInt();
		
		this.arr = new ArrayList<Integer>(numberOfElements);
		System.out.println("Enter elements:");
		for(int i = 0; i < numberOfElements; i++) {
			arr.add(sc.nextInt());
		}		
		
	}
	
	private int getSum(ArrayList<Integer> arrayList ) {
		int sum = 0;
		for(Integer x : arrayList) {
			sum +=x;
		}
		return sum;
	}

	public void displayData() {
		
		int sum = getSum(arr);
		System.out.println("Sum :"+sum);
		double average = sum/numberOfElements;
		System.out.println("Average :"+average);
		Integer max = Collections.max(arr); 
		System.out.println("Maximum valued element:" + max);
		Integer min = Collections.min(arr);
		System.out.println("Minimum valued element:" + min);
		
	}
	
	
	
}
