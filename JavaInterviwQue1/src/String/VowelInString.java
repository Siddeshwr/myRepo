package String;

public class VowelInString {
	 public static void main(String[] args) {  

		 String a="Arnaa SidiiI";
		 
		 //a.equalsIgnoreCase("");
		 String b=a.replaceAll("[^a-e-i-o-u]", "");
		 System.out.println(b);
		 int Vcount=0;
		 for(int i=0;i<=a.length()-1;i++)
		 {
			 if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||
					 a.charAt(i)=='o'||a.charAt(i)=='u')
			 {
				 Vcount++;
			 }
		 }
		 System.out.println(Vcount);
		 
		 
	 }
}
