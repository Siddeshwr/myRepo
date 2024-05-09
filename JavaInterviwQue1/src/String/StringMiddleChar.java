package String;

public class StringMiddleChar {

	public static void main(String[] args)
	{
		
		String a="1234560";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
         System.out.println(" ");
		int slength =a.length();
		
		int middle=slength/2;
		
		char c=a.charAt(middle);
		System.out.println(c);
}}
