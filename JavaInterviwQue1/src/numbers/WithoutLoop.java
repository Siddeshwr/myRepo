package numbers;

public class WithoutLoop {

	public static void main(String[] args) {
		 
		 printnum(10);
               

	}
	public static void printnum(int num) {
		if(num<=100 ) {
			System.out.println(num);
			 num++;
			 printnum(num);
		}
		
	}
}
