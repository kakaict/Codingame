package interview;

import java.util.Arrays;

/**
*
*khaitq on 25 févr. 2018
*/


/*
 * Given an array of number and an integer N, find all pairs those sum is N. 
 */
public class PairInArray {

	public static void main(String[] args) {

		int[] array = new int[] {  1,4, 5, 9, 3, 6 , 4} ;
		
		int N = 10;
		
		System.out.println(findPairFromArrayAndSum(array, N));

	}
	
	private static String findPairFromArrayAndSum(int[] array, int N) {
		
		String result = "";
		int[] mask = new int[array.length];
		for (int i = 0; i < array.length; i ++) {
			int c = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int temp = array[j];
				if (c + temp == N && Arrays.binarySearch(mask, temp) < 0  && Arrays.binarySearch(mask, c) < 0) {
					result += " " + c + "-" + array[j];
					mask[mask.length-1] = temp;
					mask[mask.length-1] = c;
				}
			}
		}
		return result;
	}

}


