package pkg1;

public class Sum extends ArrayOperations{

	public Sum() {
		super();
	}

	public Sum(ArrayOperations ob) {
		super(ob);
	}

	public Sum(int size) {
		super(size);
	}

	public Sum(int[] array) {
		super(array);
	}
	
	@Override
	public void operation() {
		
		Integer sum = 0;
		
		for(Integer x:arr) {
			sum+=x;
		}
		
		System.out.println("The sum of the elements in the array:"+sum);
	}
}
