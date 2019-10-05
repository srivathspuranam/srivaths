package com.srivaths.variables;

public class SumEvenOdd {
public static void main(String[] args) {
	 
	int i=1;
	int esum=0;
	int osum=0;
	
	while(i<=10)
	{
		if(i%2==0)
		{
			esum=esum+i;
			}
		else
		{
			osum = osum+i;
			}
i++;
}
	System.out.println("evensum= " + esum);
	System.out.println("oddsum= " + osum);
	}
}
