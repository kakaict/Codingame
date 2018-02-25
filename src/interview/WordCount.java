package interview;


/**
*
*khaitq on 25 févr. 2018
*/

public class WordCount {

	public static void main(String[] args) {

		countWordInSentence("Do  what you   see ");
	}
	
	/*
	 * Count number of word in a sentence (dont use Split method)
	 * Words are separated by a blank character
	 */
	private static void countWordInSentence(String s) {
		
//		return s.trim().split(" ").length;
		
		int result = 1;
		for (int i =0; i <s.length() - 1; i++) {
			if (i != 0 && s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				result ++;
			}
		}
		System.out.println(result);
		
	}

}


