package String;

public class AlternateWordReverse {

	 public void reverse(String str) {
	        String[] tokens = str.split(" ");
	        String result = "";
	        String k = "";
	        for(int i=0; i<tokens.length; i++) {
	            if(i%2 == 0)
	                System.out.print(" " + tokens[i] + " ");
	            else
	                result = tokens[i];
	                
	                for (int j = result.length()-1; j >= 0; j--)  {
	                    k = "" + result.charAt(j);
	                    System.out.print(k);
	                }
	                result = "";
	        }   
	    }
	    
	    

	    public static void main(String[] args) {
	        
	    	AlternateWordReverse obj = new AlternateWordReverse();
	        obj.reverse("Java is very cool prog lang");
	    }
	}
