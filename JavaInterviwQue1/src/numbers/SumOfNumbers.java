package numbers;

public class SumOfNumbers {

	public static void main(String[] args)
	{
	  int a= 789;
	  int sum=0;
	  
	  while(a>0)
	  {
		  sum=sum+a%10;   //0+9,9+8,17+7
		  a=a/10;         //78, 7,0
	  }
   System.out.println(sum);
   
   
}}
