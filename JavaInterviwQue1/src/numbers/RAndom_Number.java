package numbers;

import java.util.Random;

public class RAndom_Number {

	public static void main(String[] args) {


		Random rm=new Random();
		
		int r=rm.nextInt(99);
		System.out.println(r);
		double m =rm.nextDouble(10);
		System.out.println(m);
		
		
		//Another Approach to call double random
		System.out.println(Math.random());
		

	}

}
