package finalMod;

public class LocalClass {
	public static void main(String[] args) {
	{
		final int A=10;
		// A=20; // not valid because A is constant through final
			System.out.println("A="+A);
		}
	}
}
