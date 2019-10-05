
public class binarySearch {
public static void main(String[] args) {
	int[]a={10,20,20,30,40,50,90};
	int num=4;
	int l=0, h=a.length-1;
	boolean flag=false;
	while(l<=h)
	{
		int m=(l+h)/2;
				if (num==a[m])
				{
					flag=true;
					System.out.println("your number is found at a["+m+"]");
					break;
				}
				else if (num>a[m])
				{
				l=m+1;
	}
	else
	{
		h=m-1;
	}
}
if(flag==false)
{
	System.out.println("your number is not found");
						}
	}
}

