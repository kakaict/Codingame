package codingame;

import java.util.LinkedList;
import java.util.List;

public class SlideWindow {

	public static void main(String[] args) {
		
		
		long s = 79l;
		
		System.out.println(s/10);

		System.out.println(s%10);
		
		System.out.println(9/5);

		System.out.println(9%5);

		
		System.out.println("======================");
		
		List<Integer> wind = new LinkedList<Integer>();
		
        int [] testData = {1,2,3,4,5,7};
        
        for (int i = 0; i < testData.length; i ++) {
        	wind = addElement(wind, testData[i], 3);
        	if (wind.size() == 3) {
        		System.out.println(getAverage(wind));
        	}
        }
        
		System.out.println("======================");

        
	}
	
	private static List<Integer> addElement (List<Integer> list, int t, int size) {
		list.add(t);
		if (list.size() > size) {
			list.remove(0);
		}
		return list;
	}
	
	private static double getAverage (List<Integer> list) {
		int sum = 0;
		for(Integer t : list){
			sum += t;
		}
		return sum/(double) list.size();
	}
	
	

}
