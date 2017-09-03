package codingame;

public class ClosetZero {

	/*
	 * 
	 * From an array of Interger, get out the element which is the closet to zero.
	 * If there are numbers which have the same absolute value => take the positive element.
	 * For example 	[13,4,9, -7]  => get 4
	 * 				[5,13,34,9, -5]  => get 5
	 */
	
	
	
	public static void main(String[] args){
		System.out.println(findCloset2(new int[] {13,4,9, -7 }));
		System.out.println(findCloset2(new int[] {5,13,34,9, -5 }));
	}
	
	public static int findCloset2(int[] ints){
		
		int [] t = new int[]{};
        int result;
        
        if (ints.length == 0) {
             return 0;
        } else {
        	result = ints[0];
        	for( int i = 1; i< ints.length; i ++){
                int element = ints[i];
                if (Math.abs(element) < Math.abs(result)) {
                   result = element;
                }  else if(Math.abs(element) == Math.abs(result)) {
                   result = element > 0? element : 0 - element;   
                }
            }
        }
        return result;
	}
}
