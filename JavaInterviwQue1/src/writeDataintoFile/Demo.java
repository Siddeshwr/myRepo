package writeDataintoFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {


		FileWriter fr=new FileWriter("H:\\Soft Tech\\file.txt");
		BufferedWriter br=new BufferedWriter(fr);
		
		br.write("Selenium with Java");
		br.close();

	}

}
