public class CByValue {
		public static void main(String[] args) {
			
			int a=10;
			int b=20;
			
			System.out.println("before call to swap method");
			System.out.println(a+"\t"+b);
			
			swap(a,b);
			
			System.out.println("After call to swap method");
			System.out.println(a+"\t"+b);
		}	
		public static void swap(int x, int y)
		{
			int temp;
			temp=x;
			x=y;
			y=temp;
		}
	}



