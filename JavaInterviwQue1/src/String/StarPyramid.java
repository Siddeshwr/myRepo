package String;

public class StarPyramid {

	public static void main(String[] args) 
	{
		String a="Siddesh";
		for(int i=0;i<a.length();i++)
	{  
			for(int j=0;j<=i;j++)
		
		{
			System.out.print(a.charAt(j));
		}
		    System.out.println(" ");

	}
		
	for(int i=0;i<=a.length()-1;i++)
	{
		for(int j=a.length()-1;j>=i;j--)
		{
			System.out.print(a.charAt(j));
		}
		System.out.println(" ");
	}

	}}
