package interview;


/**
*
*khaitq on 25 févr. 2018
*/

/*
 * Given an ascii string, check it contains unique characters. (don’t use set)
 */

public class UniqueCharater {

	public static void main(String[] args) {

		System.out.println(checkStringContainUniqueElement("abcde a"));
		
	}
	
	private static boolean checkStringContainUniqueElement(String s) {
		
		boolean[] charAssci = new boolean[256];
		
		for (char c : s.toCharArray()) {
			int v = (int)c;
			if (charAssci[v]) {
				return false;
			}
			charAssci[v] = true;
		}
		
		return true;
	}

}


