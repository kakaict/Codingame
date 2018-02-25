package interview;

import java.util.Random;

/**
*
*khaitq on 25 févr. 2018
*/

/*
 * Given a matrix NxN, find all “zero” element whose all column and row are 0
 */

public class MatrixZero {

	public static void main(String[] args) {
		
		int n = 3;
		int [][] matrix = new int[n][n];
		
		matrix = initMatrix(matrix);
		
		printMatrix(matrix);
		
		System.out.println("zero element: " + findAllZeroElement(matrix));
		
	}
	
	/*
	 * Solution2
	 */
	private static String findAllZeroElement2(int [][] matrix) {
		
		int N = matrix.length;
		

		/*
		 * Find all zero row and zero column and zero diagonal and print out their common element
		 * 
		 * 
		 * 
		 */
		
 		
		return "";
	}
	
	/*
	 * Solution1
	 */
	private static String findAllZeroElement(int [][] matrix) {
		
		String result = "";
		for (int i = 0; i < matrix.length ;i++) {
			for (int j = 0; j < matrix[i].length; j ++) {
					
					if (matrix[i][j] == 0 && isZeroRow(matrix, i,j) && isZeroColumn(matrix,i,j) && isZeroDiagonal1(matrix,i,j) && isZeroDiagonal2(matrix,i,j)) {
						result += " m"+i+j;
					}
			}
		}
		
		return result;
	}
	
	private static boolean isZeroDiagonal2(int[][] matrix, int i, int j) {

		int  N = matrix[i].length;
		for (int k1 = -N; k1 < N; k1 ++) {
			int t1 = i+k1;
			int t2 = j-k1;
			if ( N >t1 && t1 >=0 && N > t2 && t2 >=0 && matrix[t1][t2] != 0) {
					return false;
			}
		}
		return true;
	}

	private static boolean isZeroDiagonal1(int[][] matrix, int i, int j) {
		
		int  N = matrix[i].length;
		for (int k1 = -N; k1 < N; k1 ++) {
			int t1 = i+k1;
			int t2 = j+k1;
			if ( N >t1 && t1 >=0 && N > t2 && t2 >=0 && matrix[t1][t2] != 0) {
					return false;
			}
		}
		return true;
	}

	private static boolean isZeroColumn(int[][] matrix, int i, int j) {
		for (int temp = 0; temp < matrix[i].length; temp ++) {
			if (matrix[temp][j] != 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isZeroRow(int[][] matrix, int i, int j) {
		for (int temp = 0; temp < matrix[i].length; temp ++) {
			if (matrix[i][temp] != 0) {
				return false;
			}
		}
		return true;
	}

	private static int [][] initMatrix(int [][] matrix) {
		Random random = new Random();
		for (int i = 0; i < matrix.length ;i++) {
			for (int j = 0; j < matrix[i].length; j ++) {
				matrix[i][j] = random.nextInt(2);
			}
		}
		matrix[0][0] = matrix[2][1] = matrix[1][1] = 0;
		return matrix;
	}
	
	private static void printMatrix(int [][] matrix) {
		
		for (int i = 0; i < matrix.length ;i++) {
			for (int j = 0; j < matrix[i].length; j ++) {
					System.out.print((matrix[i][j]) + "   ");
			}
			System.out.println();
		}
	}

}


