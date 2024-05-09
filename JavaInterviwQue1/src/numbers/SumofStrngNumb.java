package numbers;

public class SumofStrngNumb {

	public static void main(String[] args)
	{

       String a ="123ab56ops78";
       
       //Output=123+56+78=257
    // A temporary string
       String temp = "0";

       // holds sum of all numbers present in the string
       int sum = 0;

       // read each character in input string
       for (int i = 0; i < a.length(); i++) 
       {
           char ch = a.charAt(i);

           // if current character is a digit
           if (Character.isDigit(ch))
               temp =temp+ ch;

           // if current character is an alphabet
           else {
               // increment sum by number found earlier
               // (if any)
               sum += Integer.parseInt(temp);

               // reset temporary string to empty
               temp = "0";
       
      }}
       sum+= Integer.parseInt(temp);
              System.out.println(sum);       
}}


