package codingame;

import java.util.LinkedList;
import java.util.List;

public class Dancing {

	/*
	modif 1 remote
	
	The first, in position 0 
	+Step 1: d1 =  1,  he is in position 1
	+Step 2: d2 = - 2, => move to position -1
	+Step 3: d3 = d2- d1 => move to position -4 

	=> get Position after step(n)
	 */
	
	public static void main(String[] args) {


		System.out.println(getPositionAtStep(459));
		
		System.out.println(getPosition(459));
	
		
	}
	
	/*  Solution 1 */
	private static int getPosition(int t){
		int position = -1;
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(-2);
		for(int i = 2; i < t; i++){
			int step = list.get(i-1) - list.get(i-2);
			position += step;
			list.add(step);
		}
		return position;
	}
	
	/*  Solution 2 */
	private static int getPositionAtStep(int   t ){
		
		int k = t % 6;
		
		if (k ==0) return 0;
		
		if (k ==1) return 1;
		
		if (k ==2) return -1;
		
		if (k ==3) return -4;
		
		if (k ==4) return -5;
		
		if (k ==5) return -1;

		return 0;
	}

}
