package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args)
	{
		List<Integer> v=new ArrayList<>(Arrays.asList(2,4,6,8,10));
		
		Set<Integer> s=new TreeSet<>(v);
		
		v.clear();
	
		for(int value:s)
		{
			v.add(value);
		}
		int n=v.size();
		System.out.println(v.get(n-2));
		
			}
}
