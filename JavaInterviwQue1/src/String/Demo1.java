package String;

public class Demo1 {

	public static void main(String[] args) {
		

		String s="h@j##gu8$47f5&^%$";
		char ch[]=s.toCharArray();
       
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i]))
			{
				System.out.print(ch[i]);
			}
			if(Character.isDigit(ch[i]))
			{
				System.out.println(ch[i]);
			}
		}
}}

