package array;

public class MinNumber {

	public static void main(String[] args) {
		// int b[]= {35,30,29,7,19,23};
		 
		int b[]=new int [6];
	
		    b[0] =35;	
		    b[1] =30;	    
		    b[2] =29;
		    b[3] =7;	
		    b[4] =19;	
		    b[5] =23;	
		
		 int min=b[0];
		 
		 for(int j=1;j<=b.length-1;j++)
		 {
			 if(b[j]<min)
			 {
				 min=b[j];
			 }
			 
		 }
		 System.out.println(min);

	}

}
