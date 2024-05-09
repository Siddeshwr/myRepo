package numbers;

public class Diamond {

	public static void main(String[] args)
	{
	    String a="123456";
		
		for(int i=0;i<=a.length()-1;i++)
		{ for(int j=0;j<=i;j++)
		    {
			System.out.print(a.charAt(j));
		    }
		
		   System.out.println(" ");
		}
		

	}

}
