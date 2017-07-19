package tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringManipulation {

	public static void main(String[] args) {

		StringManipulation sm = new StringManipulation();

		String str = "figoifagotomoto";

		System.out.println(sm.findIndexOfFirstRepeatingCharacterInString(str));
		System.out.println(sm.findFirstRepeatingCharacterInString(str));
		sm.displayCountOfCharactersInString(str);

	}

	public int findIndexOfFirstRepeatingCharacterInString(String s) {
		int retVal = -1;
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (set.contains(c)) {
				retVal = i;
				break;
			}
			set.add(c);
		}
		return retVal;
	}

	public char findFirstRepeatingCharacterInString(String s) {
		char retVal = 0;
		Set<Character> set = new HashSet<>();
		char[] charArray = s.toCharArray();

		for (char c : charArray) {
			if (set.contains(c)) {
				retVal = c;
				break;
			}
			set.add(c);
		}
		return retVal;
	}

	public void displayCountOfCharactersInString(String s) {
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = s.toCharArray();

		for (char c : charArray) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}