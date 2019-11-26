package retest;

import java.util.Scanner;

public class TwentySix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("Enter a character");
		String str1 = sc.nextLine();
		String replace = str.replace(str1, "");
		System.out.println("charcter removed= " + replace);
	}
}
