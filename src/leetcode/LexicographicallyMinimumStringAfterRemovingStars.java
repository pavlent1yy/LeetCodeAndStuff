package leetcode;

import java.util.HashMap;
import java.lang.StringBuilder;

public class LexicographicallyMinimumStringAfterRemovingStars {
	public static void main(String[] args) {
		System.out.println(clearStars("aaba*")); // "aab"
		System.out.println(clearStars("abc")); // "abc"
		System.out.println(clearStars("a*q")); // "q"
	}

	public static String clearStars(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		if (!map.containsKey('*')) {
			return s;
		} else {
			StringBuilder sb = new StringBuilder(s);
			sb.delete(map.get('*') - 1, map.get('*') + 1);
			s = sb.toString();
		}
		return s;
		// String[] splitedString = s.split("\\*");
		// if (splitedString[0].equals(s))
		// return s;
		// String resultString = "";
		// for (int i = 0; i < splitedString.length; i++) {
		// StringBuilder sb = new StringBuilder(splitedString[i]);
		// sb.deleteCharAt(sb.length() - 1);
		// resultString += sb.toString();
		// }
		// System.out.println(List.of(splitedString));
		// return resultString;
	}
}
