package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
	public static void main(String[] args) {
		System.out.println(toJadenCase("helLO, mY naMe is paulo"));
	}

	public static String toJadenCase(String phrase) {
		if (phrase != null && phrase.length() > 0) {
			String[] words = phrase.split(" ");
			return Arrays.asList(words).stream()
					.map(el -> Character.toUpperCase(el.charAt(0)) + el.substring(1).toLowerCase())
					.collect(Collectors.joining(" "));
		}
		return null;
	}

}
