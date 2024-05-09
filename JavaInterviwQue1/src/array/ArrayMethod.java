package array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMethod {
	
	public static void reverse(String s[])
	    {
	        Collections.reverse(Arrays.asList(s));
	        System.out.println("Reversed Array:" + Arrays.asList(s));
	    }
	 
	     public static void main(String[] args)
	    {
	        String [] s = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
	        System.out.println("Original Array:" + Arrays.asList(s));
	        reverse(s);
	    }
}
