package String;

public class Function {

	public static void reverse(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	
	
	public static void main(String[] args) 
	{
     String s="Siddeshwr";
     
     reverse(s);

	}

}
