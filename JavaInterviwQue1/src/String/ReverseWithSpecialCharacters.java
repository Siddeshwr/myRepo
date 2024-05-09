package String;

public class ReverseWithSpecialCharacters {

	public static void reverseString(char[] b) {
		int l=0;
		int r=b.length-1;
		while (l<r)
		{
			if(!Character.isAlphabetic(b[l])) {
				l++;
			}
			else if(!Character.isAlphabetic(b[r]))
			{
				r--;
			}
			else
			{
				char temp=b[r];
				b[r]=b[l];
				b[l]=temp;
				l++;
				r--;
			}
		}
	}
	
	


	public static void main(String[] args) {

       String a="Sid@%$#Ok";  //ko@%$#Sid
       
       char [] b=a.toCharArray();
       
       System.out.println("input  string "+a);
       
       reverseString(b);
       String rev=new String(b);
       System.out.println("Output String "+rev);
      
       
       
       
       
       
	}}
