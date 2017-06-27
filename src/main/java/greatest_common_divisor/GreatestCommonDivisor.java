package greatest_common_divisor;

public class GreatestCommonDivisor {

	public int gcd(int x, int y) {
		if (y == 0) {
			return Math.abs(x);
		}
		return gcd(y, x % y);
	}
}
