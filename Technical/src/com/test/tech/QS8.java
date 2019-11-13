package com.test.tech;

public class QS8 {
public static void main(String[] args) {
int a[]=new int []{99,98,97,89,1,2,4,3},temp=0;
	for(int i=0;i<a.length-1;i++)
		{
		for(int j=0;j<a.length-1-i;j++)
		{
	if(a[j]>a[j+1])
	{
	temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
}
}
}
for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"\n");
	}
}
}

