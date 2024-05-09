package array;

public class DuplicateArray {

	public static void main(String[] args) {

     String a [] = {"TestNg","Java","Selenium","Java","Selenium","java"};
     
      for(int i=0;i<a.length;i++)
     {
    	 for(int j=i+1;j<a.length;j++)
    	 {
    		 if(a[i]==a[j])
    		 {
    			 System.out.println("Duplicates array found "+a[i]);
    		 }}
    	 }
  	}}
