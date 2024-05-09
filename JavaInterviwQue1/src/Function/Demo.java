package Function;

public class Demo {

	public static void reversestring(String one)
	{
		for(int i=one.length()-1;i>=0;i--)
		{
			System.out.print(one.charAt(i));
		}
		
	}
	public static void main(String[] args)
	{
		String one="Siddeshwr";
		reversestring(one);
	}

}
 