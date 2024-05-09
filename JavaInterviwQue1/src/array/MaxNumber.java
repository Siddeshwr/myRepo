package array;

public class MaxNumber {

	public static void main(String[] args)
	{
		int a[]= {20,10,70,30,95,77,100};
		
		int max=a[0];    //20 , 20,70,70
		
		for(int i=0;i<a.length;i++) //10,70,30,95 
		{
			if(a[i]>max)  //10>20 70>20 30>70  95>70
			{
				max=a[i];   //20 ,70,70,95 (hence 95 is max number)
			}
		}
		
		System.out.println(max);

	}

}
