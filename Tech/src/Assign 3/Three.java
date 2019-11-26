package retest;

import java.util.ArrayList;

public class TwentyFour {
public static void main(String[] args) {
	
	int []a = {50,560,380,40,550};
	
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1-i;j++)	
		{
			if(a[j]>a[j+1])
			{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(" "+a[i]);
	}

}
}

