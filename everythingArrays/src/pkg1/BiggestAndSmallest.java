package pkg1;

public class BiggestAndSmallest extends ArrayOperations{
	
	public BiggestAndSmallest() {
		super();
	}
	

	public BiggestAndSmallest(ArrayOperations ob) {
		super(ob);
	}


	public BiggestAndSmallest(int size) {
		super(size);
		
	}


	public BiggestAndSmallest(int[] array) {
		super(array);
		
	}


	@SuppressWarnings("static-access")
	@Override
	public void operation() {
		
		System.out.println("The maximum element in the array:"+ArrayCollections.c.max(arr));
		System.out.println("The minimum element in the array:"+ArrayCollections.c.min(arr));
		
	}

}
