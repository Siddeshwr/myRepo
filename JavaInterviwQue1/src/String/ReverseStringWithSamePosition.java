package String;

public class ReverseStringWithSamePosition {

	public static void main(String[] args) {

         //String reverse but position changed
		String a="Pune Mumbai Delhi";
		System.out.println(a);
		
		 a.split(" ");
		 
		 for(int i=a.length()-1;i>=0;i--)
		 {
			 System.out.print(a.charAt(i));
		 }
		 
		System.out.println(" ");
		 
          		
		System.out.println("==== String reverse but position same =====");
  	
		a="Pune Mumbai Delhi";
		
		String c[]= a.split(" ");
		
		String reverseString="";
		
		for(String w:c)
		{
			String reverseWord=" ";
			for(int i=w.length()-1;i>=0;i--) 
			{
				reverseWord=reverseWord+w.charAt(i);
			}
			
			reverseString=reverseString+reverseWord;
		}
		System.out.println(reverseString);
		
	}}
