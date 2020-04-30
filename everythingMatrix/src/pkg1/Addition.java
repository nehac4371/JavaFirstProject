package pkg1;

public class Addition extends MatrixOperations{
	
	
	public Addition() {
		
	}
	
	public Addition(int n) {
		super(n);
	}

	public Addition(int[][] mat) {
		super(mat);
	}

	public Addition(MatrixOperations ob) {
		super(ob);
	}

	public int[][] operation(int[][] matrix) {
		
		int [][] sum = new int[mat.length][mat.length];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				sum[i][j] = mat[i][j] + matrix[i][j];
			}
		}
		
		return sum;
	}



}
