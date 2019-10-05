package com.srivaths.variables;

public class LadderIfConditions {
public static void main(String[] args) {
	
/*	int sub1 = 50;
	int sub2 = 40;
	int sub3 = 39;
	
	if (sub1>=40)
	{
		if (sub2>=40)
		{
			if(sub3>=40)
			{
				System.out.println("PASS");
			}
			else 
			{
				System.out.println("FAIL");
			}
		}
			else
			{
				System.out.println("FAIL");
			}
	    }
	else
	{
		System.out.println("FAIL");
	}     */
	
	
	// ANOTHER METHOD
	
	int a=40;
    int b=50;
    int c=60;
    
    if (a>=40 && b>=40 && c>=40)
    {
    	System.out.println("PASS");
    }else
    {
    	System.out.println("FAIL");
    }
}
}
