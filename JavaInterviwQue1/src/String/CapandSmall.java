package String;

import java.util.HashMap;

public class CapandSmall {

	public static void main(String[] args) {
	
	
		String a="SiDDeShwR";
		
		String b=a.replaceAll("[^A-Z]", "");
		String c=a.replaceAll("[^a-z]","");
		
		System.out.println(b);
		System.out.println(c);
		int x=b.length();
		int y=c.length();
         
		System.out.println(x);
		System.out.println(y);
      
	}
}
