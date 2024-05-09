package String;
public class Split {

	
	public static void main(String[] args)
{
	  String str = "geekss@for@geekss";
	  String[] b = str.split("@",5);
	  
	  
	  for (String a : b)
	  {
	    System.out.println(a);
	  }

System.out.println(".....................Split Methods.........................");	  
	  
	  
String e=" Sid desh war ";

String d=e.replaceAll("\\s","");

System.out.println(d);

String c=e.replaceAll("\\s","@");
System.out.println(c);
	  
	  
	  


}}
	


