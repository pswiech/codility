package codility;

public class GreatestCommonDivisor {

	public int gcd(int x, int y) {
		if (y == 0) {
			return Math.abs(x);
		}
		return gcd(y, x % y);
	}

	public int gcdIterative(int x, int y) {
		while (y != 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		return Math.abs(x);
	}
}
