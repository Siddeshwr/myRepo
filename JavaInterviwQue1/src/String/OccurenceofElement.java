package String;

import java.util.HashMap;

public class OccurenceofElement {

	public static void main(String[] args) 
	{
       String a="AabbbcccCCdddddfgfhfghfgghfg";
       int count=0;
       
       HashMap hs =new HashMap();
       
       for(int i=0;i<a.length();i++)
       {
    	   count=0;
    	   for(int j=0;j<a.length();j++)
    	   {
    		   if(a.charAt(i)==a.charAt(j))
    		   {
    			   count++;
    		   }
    		   hs.put(a.charAt(i),count);
    	   }
       }
       System.out.println(hs);

	}

}
