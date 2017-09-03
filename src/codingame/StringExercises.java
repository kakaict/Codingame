package codingame;

import java.util.ArrayList;
import java.util.Arrays;

public class StringExercises {
	
	
	public static void main(String[] args) {
		
		String s = "The codingame 2017";
		
		System.out.println(reverString2(s));

		System.out.println(countCharater("agfabcda", 'a'));

		int a[] = new int[]{4,5,3,9,0};
		Arrays.sort(a);
		System.out.println(a[a.length - 1]);
		
		ArrayList l = new ArrayList<Integer>();
		
		l.ensureCapacity(5);
		
	}
	
	private static int countCharater(String input, char c){
		return input.length() - input.replaceAll(c+"", "").length();
	}
	
	@SuppressWarnings("unused")
	private static String revertString1(String input){
		StringBuffer result = new StringBuffer("");
		for (int i = input.length(); i > 0 ; i --){
			result.append(input.charAt(i -1));
		}
		return result.toString() ;
	}
	
	private static String reverString2(String input){
		return new StringBuffer(input).reverse().toString();
	}

}
