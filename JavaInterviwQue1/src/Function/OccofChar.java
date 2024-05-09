package Function;

import java.util.HashMap;

public class OccofChar 
{
	public static void demo(String a,char ch,int count)
	{
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<a.length();i++)
	   {
			ch=a.charAt(i);
			
			if(hm.containsKey(ch))
			{
				count=hm.get(ch);
				count++;
				hm.replace(ch,count);
			}
			else
			{
				hm.put(ch,1);
			}
		}
		for(Character key:hm.keySet())
		{
			System.out.print(key+"="+hm.get(key)+",");
		}
		
}
	
	public static void main(String[] args)
	{
	   String a="Siddheshwar";
       char ch = 0;
       int count = 0;
       demo(a, ch, count);
       }
	}
