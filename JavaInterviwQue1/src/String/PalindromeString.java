package String;

public class PalindromeString {

	public static void main(String[] args) {

	     String a="madam";

	    String b="";
	   
	   for(int i=a.length()-1;i>=0;i--)
	 
	   {
	      b=b+a.charAt(i);
	   }
	System.out.println(b);


	 if(a.equals(b))
	   {
	     System.out.println("String is Palindrome");

	    }

	 else
	 {
	 System.out.println("String is not palindrome");
	 }

	}
	
}
