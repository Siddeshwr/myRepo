package String;

public class SeprateUpperCaseandLower {

	public static void main(String[] args) {

             String a="SElenium With JAVA and TestNG";
             
             for(int i=0;i<a.length()-1;i++)
          {   if(Character.isUpperCase(a.charAt(i)))
               {
            	 System.out.print(a.charAt(i));
            	
                }  }
             System.out.println(" ");
             for (int j=0;j<a.length()-1;j++)
             {
            	 if(Character.isLowerCase(a.charAt(j)))
            	 {
            		 System.out.print(a.charAt(j));
            	 }
             }
             
             
	}

}
