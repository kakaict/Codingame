package codingame;

public class CorrectionString {

	
	/*
	 Check a string's correction.
	 
	 - A string S contains only 4 different characters:  (,),[,] and they are repeated.
	 - If S is correct, => (S) and [S] are correct.
	 - If S1 , S2 are correct => the concentration of S1 qnd S2 is correct.
	 
	 Example:
	 
	 "(()()[])" , "[(([]))]" "[((()[][()]))()]" are correct.
	 "([]())" is correct.
	 "(]" , "((" , "([)" are not correct
	 
	 */
	
	
	public static void main(String[] args) {

//		System.out.println(valideString1("()[]("));
//		System.out.println(valideString1("()[[(()[()]())]()]"));
//		System.out.println(valideString1("[()((()[]()[()]))()]"));
		
		System.out.println(validateString2("[()((()[]()[()]))()]"));
		System.out.println(validateString2("()[[(()[()]())]()]"));

		
	}
	
	private static boolean valideString1(String s){
		
		System.out.println(s);
		
		if(s.length() == 0) return false;
		if(s.length()%2 == 1) return false;
		
		if (s.charAt(0) == '(' && s.charAt(1) == ')') {
			if (s.length() == 2) return true;
			String sub = s.substring(2, s.length());
			return valideString1(sub);
		}
		
		if (s.charAt(s.length()-2) == '(' && s.charAt(s.length()-1) == ')') {
			if (s.length() == 2) return true;
			return valideString1(s.substring(0, s.length()-2));
		}
		
		if (s.charAt(0) == '(' && s.charAt(s.length()-1) == ')') {
			if (s.length() == 2) return true;
			String sub = s.substring(1, s.length()-1);
			return valideString1(sub);
		}
		
		if (s.charAt(0) == '[' && s.charAt(1) == ']') {
			if (s.length() == 2) return true;
			String sub = s.substring(2, s.length());
			return valideString1(sub);
		}
		
		if (s.charAt(s.length()-2) == '[' && s.charAt(s.length()-1) == ']') {
			if (s.length() == 2) return true;
			return valideString1(s.substring(0, s.length()-2));
		}
		
		if (s.charAt(0) == '[' && s.charAt(s.length()-1) == ']') {
			if (s.length() == 2) return true;
			String sub = s.substring(1, s.length()-1);
			return valideString1(sub);
		}
		
		return false;
	}
	
	private static boolean validateString2(String str){
		
		String m1 = "()";
		String m2 = "[]";
		
		System.out.println(str);

		if (str.equals(m1) || str.equals(m2)) return true;

		if (str.contains(m1)) 
			return validateString2(str.replace(m1, ""));
		if (str.contains(m2))
			return validateString2(str.replace(m2, ""));
		
		return false;
	}

}
