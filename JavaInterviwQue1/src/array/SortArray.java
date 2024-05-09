package array;

public class SortArray {

	public static void main(String[] args)
{
		 int [] intArray = new int [] {52,45,32,64,12,87,78,98,23,7};     
	        int b = 0;    
	 
	         
	        //Sort the array in ascending order using two for loops    
	        for (int i = 0; i <intArray.length; i++)
	        {     
	          for (int j = i+1; j <intArray.length; j++) 
	          {     
	              if(intArray[i] >intArray[j])  //swap elements if not in order
	              {    //> ascending order and <for descending Order
	                 b = intArray[i];    
	                 intArray[i] = intArray[j];    
	                 intArray[j]=b;    
	              }     
	          }     
	        }    
	           
	        System.out.println("Array sorted in ascending order: ");     //print sorted array
	        for (int i = 0; i <intArray.length; i++)
	        {     
	            System.out.print(intArray[i] + " ");    
	        }    
}}


