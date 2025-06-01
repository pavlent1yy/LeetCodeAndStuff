package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class PigLatin {
	public static void main(String[] args) {
		System.out.println(pigIt("Pig latin is cool !"));
	}

	public static String pigIt(String str) {
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(str.split(" ")));
		StringBuilder resultString = new StringBuilder();
		for (int i = 0; i < strList.size(); i++) {
			StringBuilder word = new StringBuilder(strList.get(i));
			word.append(word.charAt(0)).deleteCharAt(0);
			if (!Pattern.matches("\\p{Punct}", word))
				word.append("ay");
			resultString.append(word).append(" ");
		}

		return resultString.toString().trim();
	}
}