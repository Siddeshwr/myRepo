package String;

import java.util.HashMap;

public class OccuranceOfCharWithMap {

	public static void main(String[] args) {

     String a="java";
     int count;
     char ch;
     a.equalsIgnoreCase("");
  
     HashMap<Character,Integer> hs= new HashMap<Character,Integer>();
      for(int i=0;i<a.length();i++)
      { ch=a.charAt(i);
    	if(hs.containsKey(ch))
    	{ count=hs.get(ch);
    		count++;
    		hs.replace(ch, count);
    	}
    	else
    	{
    		hs.put(ch,1);
    	}
    	  
      }
       for(Character key:hs.keySet())
       {
    	   System.out.print(key+" ="+hs.get(key)+",");
       }
	}}
