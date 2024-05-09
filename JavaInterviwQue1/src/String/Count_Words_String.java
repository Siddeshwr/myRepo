package String;



public class Count_Words_String {

	public static void main(String[] args) 
	{
	
        String a="Sid Arjun Girme";
      
        
        int count=1;
        for(int i=0;i<a.length();i++)
        {
        	if((a.charAt(i)==' ') &&(a.charAt(i+1)!=' '))
        			{
        		        count++;
        			}
        }
        
         System.out.println("number of words : "+count);
         
       //Another Method

		  String d="ok bye SeeU hello";
		  String b[]=d.split(" ");
		  System.out.println("numbers of words: "+b.length);
}}
