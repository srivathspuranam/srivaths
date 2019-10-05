
public class TwoDimensionalArrays {
public static void main(String[] args) {
	int[][]a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
	int i;
	for (i=0;i<a.length;i++)
	{
System.out.println();
	for(int j=0;j<a[i].length;j++)
	{
				System.out.print(a[i][j]+"\t");
	}
}
}
}