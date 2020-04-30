package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo{

	public Demo() {
		
	}

	public static void main(String[] args) {
		
		//Addition 
		NumProcess add = (a,b)->(a+b);
		System.out.println(add.calculate(10, 20));
		
		//Subtraction
		NumProcess subtract = (a,b)->(a-b);
		System.out.println(subtract.calculate(10, 20));
		
		//Multiplication
		NumProcess multiply= (a,b)->(a*b);
		System.out.println(multiply.calculate(10, 20));
		
		//Division
		NumProcess divide = (a,b)->(b/a);
		System.out.println(divide.calculate(10, 20));
		
		List<NumProcess> operations = new ArrayList<NumProcess>(Arrays.asList(add,subtract,multiply,divide));
		
		System.out.println("Enter Number1:");
		int num1 = Reader.sc.nextInt();
		
		System.out.println("Enter Number2:");
		int num2 = Reader.sc.nextInt();
		
		System.out.println("Enter the operation:");
		String str = Reader.sc.next();
		
		//operations.stream()
		//.filter().orElse();
		
		
		
	}

	
}
