package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreatestCommonDivisorTest {

	@Test
	public void gcdRecursiveTest() {
		GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
		assertEquals(2, greatestCommonDivisor.gcd(2, -4));
		assertEquals(2, greatestCommonDivisor.gcd(-2, 4));
		assertEquals(2, greatestCommonDivisor.gcd(-2, -4));
		assertEquals(0, greatestCommonDivisor.gcd(0, 0));
		assertEquals(6, greatestCommonDivisor.gcd(0, 6));
		assertEquals(6, greatestCommonDivisor.gcd(6, 0));
		assertEquals(2, greatestCommonDivisor.gcd(6, 8));
		assertEquals(2, greatestCommonDivisor.gcd(8, 6));
		assertEquals(2*3*3*5, greatestCommonDivisor.gcd(2*2*3*3*5*5*5, 2*3*3*3*5*7));
	}

	@Test
	public void gcdIterativeTest() {
		GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
		assertEquals(2, greatestCommonDivisor.gcdIterative(2, -4));
		assertEquals(2, greatestCommonDivisor.gcdIterative(-2, 4));
		assertEquals(2, greatestCommonDivisor.gcdIterative(-2, -4));
		assertEquals(0, greatestCommonDivisor.gcdIterative(0, 0));
		assertEquals(6, greatestCommonDivisor.gcdIterative(0, 6));
		assertEquals(6, greatestCommonDivisor.gcdIterative(6, 0));
		assertEquals(2, greatestCommonDivisor.gcdIterative(6, 8));
		assertEquals(2, greatestCommonDivisor.gcdIterative(8, 6));
		assertEquals(2*3*3*5, greatestCommonDivisor.gcdIterative(2*2*3*3*5*5*5, 2*3*3*3*5*7));
	}
	
	@Test
	public void gcdEuclideanTest() {
		GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
		assertEquals(0, greatestCommonDivisor.egcd(0, 0));
		assertEquals(6, greatestCommonDivisor.egcd(0, 6));
		assertEquals(6, greatestCommonDivisor.egcd(6, 0));
		assertEquals(2, greatestCommonDivisor.egcd(6, 8));
		assertEquals(2, greatestCommonDivisor.egcd(8, 6));
		assertEquals(2*3*3*5, greatestCommonDivisor.egcd(2*2*3*3*5*5*5, 2*3*3*3*5*7));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void gcdEuclideanTest2() {
		GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
		assertEquals(2, greatestCommonDivisor.egcd(2, -4));
	}	

}
