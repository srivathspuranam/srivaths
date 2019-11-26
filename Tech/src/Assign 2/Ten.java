package retest;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwentyThree {
public static void main(String[] args) throws IOException {
	
	File file = null;
	FileInputStream fis = null;
	DataInputStream dis = null;
	ArrayList<String> list = new ArrayList<String>();  
	StringBuffer sb = new StringBuffer();
	Map<String, Integer> words = new HashMap<String, Integer>();
	try
	{   
		fis = new FileInputStream(file);
		dis = new DataInputStream(fis);
		String line = dis.readLine();
		while (line!= null && !line.isEmpty()) {
			sb.append(line.toLowerCase());
			sb.append(" ");
			line = dis.readLine();
		}
		String[] split=sb.toString().split(" ");
		for (int j=0;j<split.length;j++) {
			list.add(split[j]);
		}
		int counter = 1;
		for (int i = 0;i<list.size();i++) {
			for (int j =i+1;j<list.size();j++) {
				if (list.get(i).equals(list.get(j))) {
					counter++;
				}
			}
			if (!words.containsKey(list.get(i))) {
				words.put(list.get(i), counter);
			}
			counter = 1;
		}
		System.out.println("Max Words are:");
		System.out.println(words);
		fis.close();
		dis.close();
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
	}
}
}
