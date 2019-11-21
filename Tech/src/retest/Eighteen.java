package retest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Eighteen {
public static void main(String[] args) throws IOException {
	 if (args.length != 2) {
         System.out.println("Invalid parameter:<File1,File2>");
         System.exit(0);
     }
	 File f1 = null;
     File f2 = null;
     File dst = null;
     Fourteen excell= new Fourteen();
      FileInputStream fis = null;
      DataInputStream dis = null;
      FileInputStream fis1 = null;
      DataInputStream dis1 = null;
      FileOutputStream fos = null;
      DataOutputStream dos = null;
      StringBuffer sb = new StringBuffer();
	try
	{
		f1 = new File(args[0]);
        f2 = new File(args[1]);
        String destination = f1.getParent() + File.pathSeparator + "Excel.xlsx";
        
        dst = new File(destination);
        fis = new FileInputStream(f1);
        dis = new DataInputStream(fis);
        
        fis1 = new FileInputStream(f2);
        dis1 = new DataInputStream(fis1);
        
        fos = new FileOutputStream(dst);
        dos = new DataOutputStream(fos);
        String records = dis.readLine();
        while (records != null && !records.isEmpty()) {
            sb.append(records + "\n");
            records = dis.readLine();
        }
        String records1 = dis1.readLine();
        while (records1 != null && !records.isEmpty()) {
            sb.append(records1 + "\n");
            records1 = dis1.readLine();
        }
        String data = sb.toString();
        String[] record = data.split("\n");
        Fourteen.generateExcelFile(record, dst);
        System.out.println("Excel file written to : " + destination);
        dis.close();
        fis.close();
        dis1.close();
        fis1.close();	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		 if (dis != null) 
         {
             dis.close();
         }
         if (dis1 != null) 
         {
             dis1.close();
         }
         if (fis != null) 
         {
             fis.close();
         }
         if (fis1 != null) 
         {
             fis1.close();
         }
	}
}
}
