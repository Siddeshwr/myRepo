package String;

public class Practice {

	public static void main(String[] args) {
	
          //removes Extra symbols
			  String a="8@@*&@%$#&#**980sid*&&$";

			  String b=a.replaceAll("[^a-zA-Z]","");
			   
			   System.out.println(b);
			   
			//remove spaces   
			   String abc="Java   Pragramming    Selenium     ok";
			  
		        abc=abc.replaceAll("\\s", "");
		        System.out.println(abc);
		        		
}

	}


