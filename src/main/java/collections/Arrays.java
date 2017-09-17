package collections;

public class Arrays {

	private static int[] a1 = new int[5];
	private static int[] a2 = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {

		for (int i : a1) {
			System.out.println(i);
		}
		for (int i : a2) {
			System.out.println(i);
		}
	}
}
