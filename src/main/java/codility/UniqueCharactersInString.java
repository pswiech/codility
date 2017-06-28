package codility;

import java.util.HashSet;

/**
 * 
 * counting-unique-characters-in-a-string
 *
 */
public class UniqueCharactersInString {
	public int count(String s) {
		HashSet<Character> set = new HashSet<>();
		
		for (char c : s.toLowerCase().toCharArray()) {
			set.add(c);
		}
		
		return set.size();
	}
}
