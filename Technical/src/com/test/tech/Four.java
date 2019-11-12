package com.test.tech;
	
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Four {
public static void main(String[] args) throws IOException {
		
	if(args.length!=1)
	{
	System.out.println("invalid syntax,Usage=Empdatafilter<EmpDataTech_file>");
	System.exit(0);
	}
	File file= new File(args[0]);
	if(!file.isFile())
	{
	System.out.println("It is not a file");
	System.exit(0);
	}
	FileInputStream fis = null;
	DataInputStream dis = null;
	    
	try
	{
	fis = new FileInputStream(file);
    dis = new DataInputStream(fis);
    String record = dis.readLine();
	StringBuffer sb = new StringBuffer();
	TreeSet<String> dept = new TreeSet<String> ();
	String[] fields = null;
	while(record!=null && !record.isEmpty() )
	{
	sb.append(record+"\n");
	fields = record.split(":");
	dept.add(fields[2]);
	record = dis.readLine();		
	}
   Iterator<String> itr= dept.iterator();
	        
   while(itr.hasNext())
   {	
	   String next = itr.next();
	   System.out.println(next);
	   String str = sb.toString();
	   String[] splits = str.split("\n");
	    for(String split : splits){
		if(split.contains(next)){
		System.out.println(split);
	}
	}
	}
	dis.close();
	fis.close();
 }
 catch (Exception e)
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
	  }
}
}

