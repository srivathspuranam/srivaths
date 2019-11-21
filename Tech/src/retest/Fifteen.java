package retest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Fifteen {
public static void main(String[] args) throws IOException {
	if(args.length!=0)
	{
		System.out.println("Invalid Syntax,Usage=Empdatafilter<EmpDataTech_file>");
		System.exit(0);
	}
	File file1= new File(args[0]);
	if(!file1.isFile())
	{
		System.out.println("It is not a file");
		System.exit(0);
	}
	FileInputStream fis = null;
	DataInputStream dis = null;
	DataOutputStream dos = null;
	FileOutputStream fos= null;
	DataOutputStream dos1 = null;
	FileOutputStream fos1= null;
	ArrayList<String> al = new ArrayList<String> (); 
	try
	{
		String s1 = file1.getParent() + file1.pathSeparator + "Male.txt";
        String s2 = file1.getParent() + file1.pathSeparator + "Female.txt";
        File d1 = new File(s1);
        fos = new FileOutputStream(d1);
        dos = new DataOutputStream(fos);
        
        File d2 = new File(s2);
        fos1 = new FileOutputStream(d2);
        dos1 = new DataOutputStream(fos1);
        
        fis = new FileInputStream(file1);
        dis = new DataInputStream(fis);
        String record = dis.readLine();
        while (record != null && !record.isEmpty()) {
            al.add(record);
            record = dis.readLine();
        }
        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.contains("M")) {
                dos.writeBytes(next);
            } else if (next.contains("F")) {
                dos1.writeBytes(next);
            }
        }	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		if(dis!=null)
		{
			dis.close();
		}
		if(fis!=null)
		{
			fis.close();
		}
		if(dos!=null)
		{
			dos.close();
		}
		if(fos!=null)
		{
			fos.close();
		}
		if(dos1!=null)
		{
			dos.close();
		}
		if(fos1!=null)
		{
			fos.close();
		}
	}
}
}
