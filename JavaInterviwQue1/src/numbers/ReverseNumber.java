package numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=12345;
		
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("12345 after reverse "+rev);

	} //String Builder And String Buffer Methods Also Used For This Approach

}