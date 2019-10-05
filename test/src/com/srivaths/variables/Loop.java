package com.srivaths.variables;

public class Loop {
public static void main(String[] args) {
	
	int i=1;
	int n=20;
	
	while (i<=n)
	{
		if(i%2!=0)
		{
			i++;
			continue;
		}
		System.out.println(i);
		i++;
		}
}
}
