package String;

public class PrintSpecific {

	public static void main(String[] args)
	{
       String a="AHCECLWLXO";  //HELLO
       String b=a.replaceAll("[^HELLO]", "");
       System.out.println(b);
       
       for(int i=0;i<=a.length()-1;i++) {
       if (a.charAt(i)!='A'||a.charAt(i)!='C'||a.charAt(i)!='W') {
    	   System.out.print(a.charAt(i));
       }

             

       }
	}

}
