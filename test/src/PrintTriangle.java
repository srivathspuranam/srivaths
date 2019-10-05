public class PrintTriangle {
public static void main(String[] args) {
	int i,j;
	int n=5;
	
	for( i=1;i<=n; i++)
	{
      		System.out.println();
	for (j=n;j>i; j--)
	{
			System.out.print(" ");
	}
	for (j=1;j<=i;j++)
	{
	        System.out.print(j+ " ");
	}
	for (j=i-1;j>=1;j--)
	{
	System.out.print(" ");
	}
	}
    for (i=i-2;i>=1;i--)
    {
        	  System.out.println();
        	  for (j=n;j>i;j--)
        	  {
        		  System.out.print(" ");
        	  }
        	  for (j=1;j<=i;j++)
        	  {
        		  System.out.print(j+" ");
        	  }
        	  for (j=i-1;j>=1;j--)
        	  {
        		  System.out.print(j+" ");
	}
          }
}
}

