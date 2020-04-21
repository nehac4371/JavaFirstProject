package com.sapient.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KeyRead_Line2 {
	
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
	
	public void displayData() {
		for(Integer x: arr) {
			System.out.print(x+"\t");
		}
		System.out.println();
	}
	
	public void sortData() {
		Collections.sort(arr);
		displayData();
	}
	
	public void findInData() {
		System.out.println("Enter the key:");
		int key = sc.nextInt();
		if(Collections.binarySearch(arr, key)>=0) {
			System.out.println("The element is present in the data");
		}else {
			System.out.println("The element is not present in the data");
		}
	}
}
