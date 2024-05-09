package String;

import java.util.Arrays;

public class AnagramsString {

	public static void main(String[] args) {
		String a="aradhya";
		String b="hradaya";
		
		char x [] =a.toCharArray();
		char y [] =b.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		System.out.println(x);
		System.out.println(y);
		
		   boolean result= Arrays.equals(x,y);
		   if(result==true)
		   {
			   System.out.println("Strings are Anagrams");
			   
		   }
		   else
		   {
			   System.out.println("Strings are not Anagrams");
		   }

		   
		   System.out.println("+++++++Another Anagram strings+++++++++");
		   
		   {  
		       String p="She is Manasvi";
		       String q="she Is namasvi";
		      p=p.replaceAll(" ", "");
		      q=q.replaceAll(" ", "");
		      
		      p=p.toLowerCase();
		      q=q.toLowerCase();

		      char r[]=p.toCharArray();
		      char s[]=q.toCharArray();

		      Arrays.sort(r);
		      Arrays.sort(s);

		      boolean resul= Arrays.equals(r,s);
		      System.out.println(resul);


		}
	}

}
