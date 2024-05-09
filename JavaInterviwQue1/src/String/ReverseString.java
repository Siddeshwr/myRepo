
package String;

public class ReverseString {

	public static void main(String[] args)
	{
   String a="Sel Web TestNG";
      //a.split(" ");
      for(int i =a.length()-1;i>=0;i--)
      {
    	  System.out.print(a.charAt(i) );
      }
      System.out.println(" ");
  System.out.println(".......................................");
      String b="Pune Mumbai Nashik";
           // b.split(" ");

         for(int j=b.length()-1;j>=0;j--)
            {
               System.out.print(b.charAt(j));
             }
	}

}
