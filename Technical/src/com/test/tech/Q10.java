package com.test.tech;

public class Q10 {
public static void main(String[] args) {
		
  int i,j;
    for(i=0;i<10;i++){
    for(j=0;j<=10;j++){
	if(j==5){
    System.out.print("A");}
	else{
    System.out.print("  ");
	continue;	
	}	
	}
    System.out.println();
    for(int k=0;k<=10;k++){
	if(k==4||k==6){
	System.out.print("B");	
	}
	else	{
	System.out.print("  ");
	continue;	}	}
	System.out.println();
	for(int A=0;A<=10;A++)	{
	if(A==3||A==7)	{
	System.out.print("C");	}
	else	{
		System.out.print("  ");
			continue;}}
		System.out.println();
		for(int A=0;A<=10;A++)	{
			if(A==2||A==8)	{
				System.out.print("D");	}
			else	{
			System.out.print("  ");
			continue;}}
		System.out.println();
		break;}
for(i=0;i<10;i++){	
	for(int k=0;k<=10;k++)	{
		if(k==3||k==7){
		System.out.print("C");	}
		else	{
		System.out.print("  ");
		continue;
		}
		}
	System.out.println();
	for(int A=0;A<=10;A++)	{
		if(A==4||A==6)		{
		System.out.print("B");	}
		else		{
		System.out.print("  ");
		continue;
		}
		}
	System.out.println();
	for(int A=0;A<=10;A++)	{
	if(A==5)		{
	System.out.print("A");	
	}
	else		{
	System.out.print("  ");
	continue;
	}
	}
	
	System.out.println();
	break;
}
}
}


