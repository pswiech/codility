package codility;

import java.util.Arrays;

/**
 * 
 * Two strings are anagrams if they are written using the same exact letters,
 * ignoring space, punctuation and capitalization.
 * 
 */
public class Anagram {

	/**
	 * @param word
	 * @param anagram
	 * @return true, if both Strings are anagram.
	 */
	public boolean isAnagram(String word, String anagram) {
		char[] charFromWord = word.toLowerCase().toCharArray();
		char[] charFromAnagram = anagram.toLowerCase().toCharArray();

		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);

		return Arrays.equals(charFromWord, charFromAnagram);
	}

	/**
	 * 
	 * @param word
	 * @param anagram
	 * @return
	 */
	public boolean isAnagram2(String word, String anagram) {
		
		if (word.length() != anagram.length()) {
			return false;
		}
		
		char[] characters = word.toLowerCase().toCharArray();
		
		StringBuilder sb = new StringBuilder(anagram.toLowerCase());
		
		for (char c : characters) {
			int index = sb.indexOf(Character.toString(c));
			if (index != -1 ) {
				sb.deleteCharAt(index);
			}
			else {
				return false;
			}
		}

		return sb.length() == 0;
	}

}
