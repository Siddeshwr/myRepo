package array;

public class AdditionExceptIndex {

	public static void main(String[] args) 
	{

		int[]arr={1,2,3,4,5};
		int[]result=new int[arr.length];
		
		
		  int i=0;
		  int sum=0;
		  while(i < arr.length)
		  {
		    int temp=arr[i];
		    result[i++]=sum;
		    sum+=temp;
		  }
		      i--;
		      sum=0;
		      while(i>=0)
		  {
		    int temp=arr[i];
		    result[i--]+=sum;
		    sum+=temp;
		  }
		  
		  for(int j=0; j < result.length; ++j){
		   System.out.print(result[j]+",");
		  }
		 }
	}

