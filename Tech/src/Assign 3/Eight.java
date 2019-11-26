package retest;

import java.util.Arrays;

public class TwentyFive {

	public static void arrange(int[] a) {
		int k = 0;
		for (int i : a) {
			if (i != 0) {
				a[k++] = i;
			}
		}
		for (int i = k; i < a.length; i++) {
			a[i] = 0;
		}
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 0, 0, 5, 6 };

		arrange(a);

		System.out.println(Arrays.toString(a));
	}

}
