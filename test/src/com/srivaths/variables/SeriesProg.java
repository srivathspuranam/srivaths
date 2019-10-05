package com.srivaths.variables;

public class SeriesProg {
public static void main(String[] args) {
	
	int i;
	int j;
	int n=20;
	
	for (i=1,j=2; i<n && j<=n;)
	{
		System.out.println(i+"\t"+ j+ "\t");
		i=i+3;
				j=j+2;
	}
}
}
