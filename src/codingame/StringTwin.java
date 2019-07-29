package codingame;


/**
*
* @author khaitq on 30 juil. 2019
*/

public class StringTwin {

    public static void main(String[] args) {

        System.out.println(isTwin("foo", "ffo"));
    }

    public static boolean isTwin(String s1, String s2) {
      
    	boolean [] mask = new boolean[256];
        
    	for (char c: s1.toCharArray()) {
            mask[c] = true;
        }
        
        for (char c: s2.toCharArray()) {
        	mask[c] = !mask[c];
        }

        for (char c: s1.toCharArray()) {
        	if (mask[c] == true)
        		return false;
        }
        return true;
    }

}


