package pkg1;

public class Demo {
	
	public static void main(String[] args) {
		
		//ArrayOperations a1 = new ArrayOperations(5);
		//a1.readArray();
		
		ArrayOperations sort = new Sort(5);
		sort.readArray();
		sort.operation();
		
		ArrayOperations bigSmall = new BiggestAndSmallest(sort);
		bigSmall.operation();
		
		//ArrayOperations sum = new Sum(5);
		//sum.operation();
		
	}
	
}
