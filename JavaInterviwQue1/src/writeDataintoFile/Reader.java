package writeDataintoFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Reader {

	public static void main(String[] args) throws IOException {


	FileReader rd=new FileReader("C:\\Users\\Admin\\Desktop\\New Text Document (4).txt");
	BufferedReader br=new BufferedReader(rd);
	
	String str;
	
	while((str =br.readLine())!=null)
	{
		System.out.println(str);
	}
	
	br.close();
	
	}
}
