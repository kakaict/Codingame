package interview;

import java.util.Random;

/**
*
*khaitq on 9 avr. 2018
*/

public class RootMatrix {

	public static void main(String[] args) {

		int [][] matrix = new int [4][4];
		initMatrix(matrix);
		printMatrix(matrix);
		
		printMatrix(rootMatrix(matrix));
	}
	
	private static int[][] rootMatrix(int[][] matrix) {
		int l= matrix.length;
		int [][] matrix2 = new int [matrix.length][matrix.length];
		for (int i = 0; i < matrix.length ;i++) {
			for (int j = 0; j < matrix[i].length; j ++) {
				matrix2[i][j]= matrix[l-j-1][i]; 
			}
		}
		return matrix2;
	}

	private static int [][] initMatrix(int [][] matrix) {
		int t = 1;
		for (int i = 0; i < matrix.length ;i++) {
			for (int j = 0; j < matrix[i].length; j ++) {
				matrix[i][j] = t++;
			}
		}
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


