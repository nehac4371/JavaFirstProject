package pkg1;

import java.util.ArrayList;
import java.util.List;



public class ArrayOperations {
	
	protected List<Integer> arr;
	private int size = 10;
	
	public ArrayOperations() {
		
		arr = new ArrayList<Integer>(size);
		
	}
	
	public ArrayOperations(int size) {
		
		this.size = size;
		arr = new ArrayList<Integer>(this.size);
		
	}
	
	public ArrayOperations(int[] array){
		
		arr = new ArrayList<Integer>();
		
		for(int i = 0; i< array.length; i++) {
			arr.add(array[i]);
		}
	}
	
	public ArrayOperations(ArrayOperations ob) {
		
		arr = ob.arr;
		
	}
	
	public void readArray() {
		
		
		for(int i = 0; i<this.size; i++) {
			
			System.out.println("Enter Element");
			int k = Reader.sc.nextInt() ;
			arr.add(k);
		
		}
	
	}
	
	protected void displayHorizontal() {
		
		for(Integer x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	private void displayVertical() {
		
		for(Integer x:arr) {
			System.out.println(x);
		}

	}
	
	public void display() {
		
		System.out.println("****Display Horizontally****");
		displayHorizontal();
		System.out.println("****Display Vertically****");
		displayVertical();
		
	}
	
	public void operation() {};	
	
}
