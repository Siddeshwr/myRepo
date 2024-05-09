package String;

public class SwapnString {

	public static void main(String[] args) {

        String a="Siddeshwr";
        String b="Girme";
        
        System.out.println("Before swap a="+ a+ " and b= "+b);
        a=a+b;
        System.out.println(a);
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        
        System.out.println("After swap a= " +a+ " and b="+b);
		
	}
}
