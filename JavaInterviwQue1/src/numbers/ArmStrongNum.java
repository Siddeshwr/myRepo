package numbers;

public class ArmStrongNum {

	public static void main(String[] args) 
	{
		int num=370;
		int r,sum=0;
		
		int temp=num;
		
		while(temp>0)
		{
			r=temp%10;
			sum=sum+r*r*r;
			temp= temp/10;
		}
       
		if(num==sum)
		{
			System.out.println(num+" is a Armstrong Number");
		}
		
		else
		{
			System.out.println(num+" not an ArmStrong Number");
		}
	}

}
