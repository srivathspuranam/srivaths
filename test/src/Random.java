public class Random {
	public static void main(String[] args) {
int [][]a;// declaration
a=new int[4][];//memory allocation
for (int i=0;i<a.length;i++){
	a[i]= new int[i+1];
	}
System.out.println("no. of rows:" +a.length);
}
}
