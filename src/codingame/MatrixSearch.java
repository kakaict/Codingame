package codingame;


/**
*
*khaitq on 11 avr. 2018
*/

public class MatrixSearch {

	public static void main(String[] args) {

		long [][] matrix = new long[20][20];
		
		initMatrix(matrix);
		
		printMatrix(matrix);

		System.out.println(matrix[19][14]);
		
		System.out.println(getElement(9,5));
		
		
	}
	
	private static int getElement(int x, int y) {
		if (x < y)
			return 0;
		
		if (x == y || y==0) 
			return 1;
		
		return getElement(x-1, y-1) +  getElement(x-1, y);
		
	}

	private static long [][] initMatrix(long [][] matrix) {
		for (int i = 0; i < matrix.length ;i++) {
			for (int j = 0; j < matrix[i].length; j ++) {
				if (i == j || j==0) {
					matrix[i][j] = 1;
				} 
				else if (i>=1 && j>=1 && matrix[i-1][j-1]!=0 && matrix[i-1][j] != 0)
					matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j]; 
				else 
					matrix[i][j] = 0;
			}
		}
		return matrix;
	}
	
	private static void printMatrix(long [][] matrix) {
		
		for (int i = 0; i < matrix.length ;i++) {
			for (int j = 0; j < matrix[i].length; j ++) {
					System.out.print((matrix[i][j]) + "   ");
			}
			System.out.println();
		}
	
	}	
}


