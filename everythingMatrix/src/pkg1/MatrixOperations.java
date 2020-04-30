package pkg1;

public class MatrixOperations {
	
	protected int[][] mat;
	
	public MatrixOperations(int n) {
		
		mat = new int[n][n];
	
	}
	
	public MatrixOperations() {
		
		mat = new int[3][3];
		
	}
	
	public MatrixOperations(int[][] mat) {
		
		this.mat = mat;
		
	}
	
	public MatrixOperations(MatrixOperations ob) {
		
		this.mat = ob.mat;
		
	}
	
	public void readMatrix() {
		
		for(int i = 0; i < mat.length; i++) {
			System.out.println("Enter elements in the row");
			for(int j = 0; j < mat.length; j++) {
				mat[i][j] = Reader.sc.nextInt();
			}
			
		}
		
	}
	
	public void displayMatrix() {
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public int[][] operation(int[][] matrix){
		return null;
	};
	
	public void operation() {
		
	};

}
