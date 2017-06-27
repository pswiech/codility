package greatest_common_divisor;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreatestCommonDivisorTest {

	@Test
	public void test() {
		GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
		assertEquals(2, greatestCommonDivisor.gcd(2, -4));
		assertEquals(2, greatestCommonDivisor.gcd(-2, 4));
		assertEquals(2, greatestCommonDivisor.gcd(-2, -4));
		assertEquals(0, greatestCommonDivisor.gcd(0, 0));
		assertEquals(6, greatestCommonDivisor.gcd(6, 0));
		assertEquals(2, greatestCommonDivisor.gcd(6, 8));
		assertEquals(2, greatestCommonDivisor.gcd(8, 6));
		assertEquals(2*3*3*5, greatestCommonDivisor.gcd(2*2*3*3*5*5*5, 2*3*3*3*5*7));
	}
}
