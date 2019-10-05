package files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Files {

	public static void main(String[] args) throws IOException {
		
				//using commandline parameter
				File file1 = new File(args[0]);
				File file2 = new File(args[1]);
				// to check existence of file, in directory, execute etc parameters.
				if(file1.exists())
				{
					System.out.println("exist ");
				}
				else
				{
					System.out.println("does not exist ");
				}
				
				if(file1.isFile())
				{
					System.out.println("it is a file");
				}
				else
				{
					System.out.println("Not a file");
				}
				
				
				if(file1.isDirectory())
				{
					System.out.println("it is a directory");
				}
				else
				{
					System.out.println("Not a directory");
				}
				
				if(file1.canRead())
				{
					System.out.println("can read ");
				}
				else
				{
					System.out.println("can not read");
				}
				if(file1.canWrite())
				{
					System.out.println("can be  modified ");
				}
				else
				{
					System.out.println("can not be  modified");
				}
				
				
				if(file1.canExecute())
				{
					System.out.println("can be  executed ");
				}
				else
				{
					System.out.println("can not be  executed");
				}
				
				long len = file1.length();
				
				System.out.println("size = "+len+" bytes");
				System.out.println("size = "+(len/1024)+" kb");
				System.out.println("size = "+(len/(1024*1024))+" mb");
				
				String parent = file1.getParent();
				
				System.out.println("parent: "+parent);
				
				String name = file1.getName(); 
				
				System.out.println("name :"+name);
				
				if( file1.renameTo(file2) )
				{
					System.out.println("renamed");
				}
				else
				{
					System.out.println("failed to rename");
				}
				
				System.out.println("path separator "+ file1.pathSeparator);
				
				Date date = new Date(file1.lastModified());
				
				System.out.println("Last modified time : "+ date);			
				File  filePath  = new File(args[0]); 			
				
				// create new file
				if(filePath.createNewFile())
				{
					System.out.println("created");
				}
				else
				{
					System.out.println("failed");
				}
				//delete the file
				File filePath2 = new File(args[1]);

				filePath2.deleteOnExit();
	}
	}
