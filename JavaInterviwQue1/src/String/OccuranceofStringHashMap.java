package String;

import java.util.HashMap;

public class OccuranceofStringHashMap {

	public static void main(String[] args)
	{
		String a="Sid is my name and Siddeshwar is my name and Siddesh";
        int count=0;
		String b[]=a.split(" ");
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(String c:b)
		{
			if(hm.containsKey(c))
			{
				count=hm.get(c);
				count++;
				hm.replace(c,count);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		for(String key:hm.keySet())
		{
			System.out.println(key+"="+hm.get(key));
		}
	}

}
