package interview;


/**
*
*khaitq on 25 févr. 2018
*/

public class WordCount {

	public static void main(String[] args) {

		System.out.println(countWordInSentence("    Do  what you   see  "));
	}
	
	/*
	 * Count number of word in a sentence (dont use Split method)
	 * Words are separated by a blank character
	 */
	private static int countWordInSentence(String s) {
		
		
		if(s == null || s.isEmpty()) 
			return 0;
		
		int result = 0;
		
		for (int i = 0; i < s.length() - 1; i++) {
			
			if (s.charAt(i) == ' ') 
				continue;
			
			if (s.charAt(i) != ' ' && s.charAt(i+1) == ' ') {
				result ++;
			}
		}
		
		return result;
	}

}


