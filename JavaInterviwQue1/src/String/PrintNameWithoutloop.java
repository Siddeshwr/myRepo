package String;

public class PrintNameWithoutloop {

	public static void main(String[] args)
	{
		String name="Siddeshwr";
		
		String a="i";
		 a=a.replaceAll("i", "iiiiii");//6
		 a=a.replaceAll("i", "iiiiii");//6*6=36
		 
		 
         a=a.replaceAll("i", name +"\n");
         System.out.println(a);
	}
}
