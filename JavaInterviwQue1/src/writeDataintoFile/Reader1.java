package writeDataintoFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader1 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		File file=new File("‪H:\\Xpath Practise.txt");
		
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}

	}

}
