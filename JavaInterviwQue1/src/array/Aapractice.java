package array;

public class Aapractice {

	public static void main(String[] args) 
   {
		int a[]= {0,4,7,10,12,15,19};
		
		int target=19;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.printf("pair found (%d,%d)",a[i],a[j]);
				}
			}
		}

	}
}
