package array;

public class CompareArray {

	public static void main(String[] args) 
	{
	
		
		int a[]= {7,5,9,10,15,16};
		
		int b[]= {5,7,10,11,12};
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				if(a[i]!=b[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}

	}

}
