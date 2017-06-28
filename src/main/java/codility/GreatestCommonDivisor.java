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
	
	/**
	 * 
	 * Euclidean algorithm for calculating the GCD
	 * 
	 * Assume that a and b are >= 0
	 * 
	 */
	public int egcd(int a, int b) {
		
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("Arguments has to be greater or equal to zero");
		}
		
	    if (a == 0)
	        return b;

	    while (b != 0) {
	        if (a > b)
	            a = a - b;
	        else
	            b = b - a;
	    }

	    return a;
	}
}
