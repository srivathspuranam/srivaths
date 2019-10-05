
public class linearSearch {
public static void main(String[] args) {
	int[]a={1,4,5,6,7,8,45,88,98,100};
	int num=0;
	boolean flag=false;
	
	for (int i=0;i<a.length;i++)
	{
		if(num==a[i])
		{
			flag=true;
			System.out.println("your no. found at a["+i+"]");
			break;
		}
	}
	if (flag=false)
	{
		System.out.println("your no. not found");
		}
	}
}

