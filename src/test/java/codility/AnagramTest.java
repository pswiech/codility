package codility;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class AnagramTest {

	@Ignore
	@Test
	public void testIsAnagram() {
		assertFalse(new Anagram().isAnagram("xx", "xxx"));
		assertFalse(new Anagram().isAnagram("Abba", "Abaa"));
		assertFalse(new Anagram().isAnagram("army", "mars"));
		assertTrue(new Anagram().isAnagram("army", "mary"));
		assertTrue(new Anagram().isAnagram("Army", "Mary"));
	}

	@Test
	public void testIsAnagram2() {
		assertFalse(new Anagram().isAnagram2("xx", "xxx"));
		assertFalse(new Anagram().isAnagram2("Abba", "Abaa"));
		assertFalse(new Anagram().isAnagram2("army", "mars"));
		assertTrue(new Anagram().isAnagram2("army", "mary"));
		assertTrue(new Anagram().isAnagram2("Army", "Mary"));
	}
}
