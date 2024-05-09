package String;

public class CountSubString {

	public static void main(String[] args)
	{
		String Main="dhimanman";
		String sub="man";
		
		int m=sub.length();
		int s=Main.length();
		int res=0;
		
		for(int i=0;i<=s-m;i++)//A loop to slide sub[] one by one */
		{
			int j;
			for(j=0;j<m;j++)
			{
				if(Main.charAt(i + j) != sub.charAt(j))
				{
					break;
				}
			}
		
		if(j==m) 
		{
            res++;
            j=0;
		}}
		
		System.out.println(res);
	}
}
