package java8;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class LambdaExpression {
	
	/*       
	 *  (argument) -> {body} 
	 *
	 */
	
	public static void main(String[] args) {
		
		test1();
	}
	
	private  static void test1(){

		WorkerInterface w = () -> System.out.print(32);
		w.doSomeWork();
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		list.forEach( name -> System.out.println(name));
		
		String[] players = {"an", "fdss", "QDSSDDS", "fds", "2231324"};
		
		Arrays.sort(players, (String s1,String s2) -> {
			return s1.length() - s2.length();
		});
		
		System.out.println(Arrays.asList(players));
		
	}
	
	@Test
	public void testSum(){
//		Assert.assertEquals(5, sum(2, 3));
		
		DoSumInterface d = (int t) ->  t* 5;
		
		Assert.assertEquals(50, d.dosum(10));
	}
	
	private int sum(int a, int b){
		return a + b;
	}
	
	@FunctionalInterface
	public interface WorkerInterface {
		public void doSomeWork();
	}
	
	@FunctionalInterface
	public interface DoSumInterface {
		public int dosum(int t);
	}
	
	

}
