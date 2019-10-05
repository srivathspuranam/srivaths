
public class Palindrome {
public static void main(String[] args) {
	
	int r,sum=0,temp;
		int n= 505;
	temp = n;
	while (n>0)
	{
		r=n%10; // to get remainder
		sum=(sum*10)+r;
		n=n/10;
	}
	if (temp==sum)
		System.out.println("Palindrome");
	else
		System.out.println("not palindrome");
}
}
