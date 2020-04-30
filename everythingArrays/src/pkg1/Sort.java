package pkg1;

public class Sort extends ArrayOperations{
	
	public Sort() {
		super();
	}
	
	public Sort(int size) {
		super(size);
	}
	
	public Sort(int[] array) {
		super(array);
	}
	
	public Sort(ArrayOperations ob) {
		super(ob);
	}

	@SuppressWarnings("static-access")
	@Override
	public void operation() {
		
		System.out.println("*****Sorted Array******");
		ArrayCollections.c.sort(arr);
		displayHorizontal();
		
	}

}
