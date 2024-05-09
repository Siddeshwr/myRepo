package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccofVowel {

	public static void main(String[] args) {
		
		String str="Pune university";
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
		if(Character.isLetterOrDigit(ch))
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		}
		for(Entry <Character,Integer>e:map.entrySet())
		{
			if(e.getKey()=='a'||e.getKey()=='e'||e.getKey()=='i'||e.getKey()=='u')
			{
				System.out.println("vow "+e.getKey()+"="+e.getValue());
                				
			}
			else
			{
			System.out.println("Con "+e.getKey()+"="+e.getValue());
			}
			
		}
		
}}


