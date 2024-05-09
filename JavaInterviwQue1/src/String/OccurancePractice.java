package String;

public class OccurancePractice {

	public static void main(String[] args) {

       String a="Siddheshwar arjun Girame";
       int c=a.length();
       System.out.println(c);
       int b=a.replaceAll("a","").length();
       System.out.println(b);
        
       System.out.println("Occurance of a in program :" +(c-b));
       
       
       System.out.println(".............");

     //Occurance of a word
     String x="Java With A Selenium and TestNG Code";

     int y=x.length();
     System.out.println(y);

     int z=x.replaceAll("[e]","").length();
     System.out.println(z);

     System.out.println("Occurance of a "+(y-z));
	}

}
