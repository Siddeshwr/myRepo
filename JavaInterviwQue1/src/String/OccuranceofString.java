package String;

import java.util.HashMap;

public class OccuranceofString {

	public static void main(String[] args)
	{
		String str = "This is is a a a string for reference";
        
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		String a[]=str.split(" ");
		for(String b:a)
		{
			Integer integer =hm.get(b);
		if(integer==null)
		{
		hm.put(b,1);	
		}
		
		else
		{
			hm.put(b, integer+1);
		}}
		System.out.println(hm);
	}}
