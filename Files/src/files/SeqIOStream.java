package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SeqIOStream {
public static void main(String[] args) throws IOException {
	File file1 = new File("D:\\srivaths\\file1.txt"); 
	File file2 = new File("D:\\srivaths\\file2.txt");
	
	FileInputStream input1 = new FileInputStream(file1);
	FileInputStream input2 = new FileInputStream(file2);
	
	SequenceInputStream  inst  =  new SequenceInputStream(input1, input2);  
	   
	   char ch=(char) inst.read();
	   
	   while(ch!=(char)-1)
	   {    
	      System.out.print(ch);
		 ch=(char)inst.read();   
	   }   
	   
	   inst.close();    
	   input1.close();    
	   input2.close(); 		
}
}
