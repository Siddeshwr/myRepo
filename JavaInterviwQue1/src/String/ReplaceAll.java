package String;

public class ReplaceAll {

	public static void main(String[] args) {
		
		
		String s=("09123 *&^%#!@*@*_)} OK StrinG 192022 ?><-*");
	    String v =s.replaceAll("[^a-zA-Z0-9]", "");
	    
		 System.out.println(v);
		 System.out.println(".........................");
		 String m=s.replaceAll("[^a-zA-Z]","");
		 System.out.println(m);
		 
		 System.out.println(".........................");
		 System.out.println("if we want to print only Special Characters then give space before after");
		 String a=s.replaceAll("[ ^a-zA-Z0-9 ]", "");
		 System.out.println(a);
		 
		 System.out.println(".........................");
		 System.out.println("if we want to print only numbers from String");
		 
		 String g=s.replaceAll("[^0-9]", "");
		 System.out.println(g);
		 
		 System.out.println("Remove space in String");
		 String  Ar=("Selenium     testing JAVA and          TESTNG ");
		 System.out.println(Ar.replaceAll("\\s", ""));
		 
		 String h=s.replaceAll("[0-9]", "");
		 System.out.println(h);
		 
		 
		 
	}
}
