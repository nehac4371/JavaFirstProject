package pkg1;

public class IsScalar extends MatrixOperations {

	public IsScalar(int n) {
		super(n);
		
	}

	public IsScalar() {
		
	}

	public IsScalar(int[][] mat) {
		super(mat);
		
	}

	public IsScalar(MatrixOperations ob) {
		super(ob);
		
	}

	@Override
	public void operation() {
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if((i != j) && (mat[i][j] != 0)) {
					
					System.out.println("This matrix is not scalar");
					return;
					
				}
			}
		}
		
		System.out.println("This matrix is a scalar matrix");
	}

}
