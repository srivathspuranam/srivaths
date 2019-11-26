package retest;

public class TwentyEight {
	public static void main(String[] args) {
		int i, j, k = 4;
		char[] ch = { 'A', 'B', 'C', 'D' };
		for (i = 1; i <= k; i++) {
			for (j = k; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print(ch[j-1]);
			for (j = 1; j < (i - 1) * 2; j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print("\n");
			} else {
				System.out.print("A\n");
			}
		}
		for (i = k - 1; i >= 1; i--) {
			for (j = k; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print(ch[j-1]);
			for (j = 1; j < (i - 1) * 2; j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print("\n");
			} else {
				System.out.print("A\n");
			}
		}

	}
}
