package codingame;

public class ReverString {
	
	
	public static void main(String[] args) {
		
		String s = "The codingame";
		System.out.println(revertString(s));
	}
	
	private static String revertString(String input){
		StringBuffer result = new StringBuffer("");
		for (int i = input.length(); i > 0 ; i --){
			result.append(input.charAt(i -1));
		}
		return result.toString() ;
	}

}
