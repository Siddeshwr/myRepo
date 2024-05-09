
package numbers;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		int a=10;int b=20;
     
		System.out.println("before Swaping... "+a+" "+b);
		
		//1
		a=a*b; b=a/b;a=a/b;
		System.out.println("After Swapping... "+a+" "+b);
		
	//2
		a=a+b;b=a-b;a=a-b;
		System.out.println("After Swapping... "+a+" "+b);
	//3	
		b=a+b-(a=b);
	    System.out.println("After Swapping... "+a+" "+b);
	  
	    System.out.println("....Introduce 3rd Variable....");
	//4     
	int c=a;a=b;b=c;
	System.out.println("After Swapping... "+a+" "+b);
		
	}

}
