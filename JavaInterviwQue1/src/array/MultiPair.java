package array;


public class MultiPair {

	public static void main(String[] args)
	{
		int num []= {2,4,6,8,10,12,15,19,9,7};
		
		int target =19;
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{	
				if(num[i]+num[j]==target)
				{
					System.out.printf("target pair(%d, %d)",num[i],num[j]);
				}
			}
		}
}}
