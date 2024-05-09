package numbers;

public class SumStringNumbAdd {

	public static void main(String[] args)
	{
		
		String a="This2isFirst2String";
		
		 String b=a.replaceAll("[^0-9]", "");
         System.out.println(b);
         
         int c=Integer.parseInt(b);
         
         System.out.println(c);
         int sum=0;
        while(c>0)
         {
        	sum=sum+c%10;
        	c=c/10;
         }
        System.out.println(sum);
         
		
		}

	}


