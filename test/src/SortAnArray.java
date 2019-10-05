import java.util.Arrays;

public class SortAnArray {
public static void main(String[] args) {
	int[] intArr={1,5,2,6,3,7,4};
	String[] strArr={"dubey","abhiram","tanay","srivaths","patil"};
	//sort in array
	Arrays.sort(intArr);
	Arrays.sort(strArr);
	System.out.println(Arrays.toString(intArr));
	System.out.println(Arrays.toString(strArr));	
}
}
