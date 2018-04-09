package codingame;


/**
*
*khaitq on 9 avr. 2018
*/

public class Soduku {

	public static void main(String[] args) {

	}
	
	private static boolean isValidatedSoduku(int [][] matrix) {
		completeSodukuMatrix(matrix);
		return true;
	}
	
	
	/**
	 * @param a matrix is to be completed, empty element is represented by - 1
	 * @return a completed soduku matrix
	 */
	private static int [][] completeSodukuMatrix(int [][] matrix) {
		
		
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


