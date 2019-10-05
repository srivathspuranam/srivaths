package Arrays;
public class differentWaysOfArrays {
public static void main(String[] args) {
	
	int a[]=new int[4];
	            a[0]=10;
	            a[1]=20;
	            a[2]=50;
	            a[3]=60;
	      int max=a[0];
	      int min=a[0];
	 for (int i=1;i<a.length;i++)           
	 {
		 if(a[i]>max)
		 {
			 max=a[i];
		 }
		 if (a[i]< min)
		 {
			 min=a[i];
			 		 }
	 }
	 System.out.println("max="+max+ "\t min= "+ min );
	}
} 
