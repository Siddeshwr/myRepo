package numbers;

public class Missing_Number {

	public static void main(String[] args) 
	{
       int a[]= {1,2,3,4,6,7,8,9};
       
       int sum1=0;
       for(int i=0;i<a.length;i++)
       {
    	   sum1=sum1+a[i];
       }
       System.out.println("Sum of elements sum1 "+sum1);

       int sum2=0;
       for(int i=1;i<10;i++)
       {
    	   sum2=sum2+i;
       }
       System.out.println("sum of elements sum2 "+sum2);
       System.out.println("missing nbr is "+(sum2-sum1));
	}

}
