package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {
public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("D:\\srivaths\\file1.txt");
	char ch =(char) fr.read();
	while(ch!=(char)-1)
	{
		System.out.print(ch);
		ch =(char) fr.read();
	}
	fr.close();

}
}
