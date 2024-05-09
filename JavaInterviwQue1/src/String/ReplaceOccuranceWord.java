package String;

public class ReplaceOccuranceWord {

	public static void main(String[] args) {

		String input= "python is programming language. python is future.";	
		String[] str = input.split(" ");
		String op="";
		
		for(String s:str)
		{
			if(s.equalsIgnoreCase("python"))
			{
				
				op=op+""+"Java";
			}
			else
			{
				op=op+" "+s;
			}
		}
		System.out.println(op);

	}

}
