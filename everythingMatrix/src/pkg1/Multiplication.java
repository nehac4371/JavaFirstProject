package pkg1;

public class Multiplication extends MatrixOperations {

	public Multiplication(int n) {
		super(n);
		
	}

	public Multiplication() {
		
	}

	public Multiplication(int[][] mat) {
		super(mat);
		
	}

	public Multiplication(MatrixOperations ob) {
		super(ob);
		
	}
	
	@Override
	public int[][] operation(int[][] matrix) {
		
		int[][] product = new int[mat.length][mat.length];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				
				product[i][j] = 0;
				
				for(int k = 0; k < mat.length; k++) {
					product[i][j] += mat[i][k]*matrix[k][j];
				}	
			}
		}
		
		return product;
		
	}

}
