package String;

public class Reverse {

	public static void main(String[] args) {
		String a="Sainath Uttam Gaike";
		String [] b=a.split(" ");
		for(int i=b[0].length()-1;i>=0;i--)
			
		{
		System.out.print(b[0].charAt(i));
		}
		
		System.out.println();//for blank line
		for(int i=b[1].length()-1;i>=0;i--)
		{
		System.out.print(b[1].charAt(i));
		}
		
		System.out.println();//for blank line
		for(int i=b[2].length()-1;i>=0;i--)
			
		{
		System.out.print(b[2].charAt(i));
		}
		
		System.out.println();//for blank line

	}}
