package String;

public class DadmomChild {

	public static void main(String[] args){
		String s= "dad mom child";
		String [] abc= s.split(" ");
		int count=0;
	
		for(int i=0;i<abc.length;i++)
		{
			String b="";
			for(int j=abc[i].length()-1;j>=0;j--) 
			{
			b=b+abc[i].charAt(j);
		    }
			if(b.equals(abc[i]))
			{
				System.out.println("String palindrome "+ abc[i]);
				count++;
			}		
		}		
           System.out.println(count);
}}

