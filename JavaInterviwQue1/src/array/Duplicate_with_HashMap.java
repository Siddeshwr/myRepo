package array;

import java.util.HashSet;

public class Duplicate_with_HashMap {

	public static void main(String[] args) {

       String arr[]= {"c","c++","Java","java","php","Python","php"};
       boolean flag =false;
       HashSet<String> hs=new HashSet();
       
       
       
       for(String l:arr)
       {
    	   if(hs.add(l)==false)
    	   {
    		   System.out.println("Duplicate Found "+l);
    		   flag=true;
    	   }
       }
       
       if(flag==false)
       {
    	   System.out.println("Duplicate Not found");
       }
       
	}

}
