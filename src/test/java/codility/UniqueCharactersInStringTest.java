package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharactersInStringTest {

	@Test
	public void test() {
		UniqueCharactersInString num = new UniqueCharactersInString();
		assertEquals(0, num.count(""));
		assertEquals(1, num.count("a"));
		assertEquals(1, num.count("aA"));
		assertEquals(2, num.count("abba"));
		assertEquals(3, num.count("abcAbCba"));
		assertEquals(3, num.count("Radar"));
	}
}
