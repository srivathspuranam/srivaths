package basics;

public class Strings {
public static void main(String[] args) {
	String s1="sRiVaThS";
	
	String s2 = s1.toUpperCase();// upper case
	String s3 = s1.toLowerCase();// lower case
	
	System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
//------------------------------------------------------------------------------	
	int index = s1.indexOf('h');// index off
	

    System.out.println(index);
//---------------------------------------------------------------------------------------
	String s4 = s1.replace("sRiVaThS", "kava");//replace
	
	 System.out.println(s1);// no change, since string is immutable object.
	    System.out.println(s4);//changed as string location is changed
//----------------------------------------------------------------------------------------	    
	String s5 = s1.trim();		// trim
	
	System.out.println(s1.length()); 
	System.out.println(s5.length()); 
//--------------------------------------------------------------------------------------    
	int s6 = s1.length();  //length
	System.out.println(s6);
//---------------------------------------------------------------------------------------
	if(s1.contains("pl")) //conatins()
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
//------------------------------------------------------------------------------------------------	
	//compare
	String s7 = "sRiVaThS";

    if(s1.equals(s7))
    {
  	  System.out.println ("both are equal");
    }
    else    {
  	  System.out.println ("not equal");
    }
 //-------------------------------------------------------------------------------------
    //split
	 String s8="java linux unix hadoop html";    

	   String [] s9 =s8.split(" ");
	   
	   for (String str : s9)
	   {    		   
		   System.out.println (str);			
	   }      
//-------------------------------------------------------------------------------------------------
	   String record = "4G0:srivaths:21:30000:male";
		
		
		String [] fields = record.split(":");		
		
			System.out.println(fields[0]+"\t"+fields[2]+"\t"+fields[3]+"\t"+fields[4]);
//----------------------------------------------------------------------------------------------

}
}
