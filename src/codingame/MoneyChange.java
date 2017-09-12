package codingame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoneyChange {

	/*
	 * The cashier has to pay a money by the 2,5,10 dollars. Find the best way to pay
	 * 
	 */
	public static void main(String[] args) {

		long s = 47;

		long t1,t2,t3 = 0;
		
		t1 = s/10;
		long x1 = s%10;
		if (x1 %2 == 0){
			t2 = 0;
			t3 = x1/2;
		} else {
			t2 = x1/5;
			long x2 = x1%5;
			t3 =x2/2;
		}

		System.out.println("number 10 = " + t1);
		System.out.println("number 5 = " + t2);
		System.out.println("number 2= " + t3);

		System.out.println("======================");
	}
	
	
	
	class DenominationSet {
		
		private List<Integer> denominations = new ArrayList<Integer>();
		
		public List<Integer> getDenominations() {
			Collections.sort(denominations);
			return denominations;
		}

		public DenominationSet(Integer ...args){
			for (int denomination : args){
				denominations.add(denomination);
			}
		}
	}
	
	

}
