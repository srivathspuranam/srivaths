package com.srivaths.variables;

public class PrimeNo {
public static void main(String[] args) {
	
	int n=12;
	boolean flag = true;
    int i=2;
   
    while(i<=n/2)
    {
    	if(n%i==0)
    	{
    	flag= false;
    	break;
    }
    i++;
}    
if(flag==true)
{
	System.out.println("PRIME NUMBER");
}
else
{
	System.out.println("composite no.");
}
}
}