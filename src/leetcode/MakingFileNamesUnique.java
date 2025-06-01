package leetcode;

import java.util.HashSet;
import java.util.List;

public class MakingFileNamesUnique {
	public static void main(String[] args) {
		System.out.println(List.of(getFolderNames(new String[] { "pes", "fifa", "gta", "pes(2019)" })));// ["pes","fifa","gta","pes(2019)"]
		System.out.println(List.of(getFolderNames(new String[] { "gta", "gta(1)", "gta", "avalon" })));// ["gta","gta(1)","gta(2)","avalon"]
		System.out.println(List.of(getFolderNames(new String[] { "kaido", "kaido(1)", "kaido", "kaido(1)" }))); // ["kaido","kaido(1)","kaido(2)","kaido(1)(1)"]
																												// ?!
	}

	public static String[] getFolderNames(String[] names) {
		if (!hasDuplicatesInArray(names))
			return names;
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < names.length; i++) {
			if (set.contains(names[i]))
				names[i] = nonuniqueName(names[i]);
			set.add(names[i]);
		}
		return getFolderNames(names);
	}

	public static String nonuniqueName(String word) {
		StringBuilder sb = new StringBuilder(word);
		for (int i = 0; i < word.length(); i++) {
			if (Character.isDigit(word.charAt(i)) && word.charAt(i - 1) == '(' && word.charAt(i - 1) == '(') {
				String numberPlusOne = String.valueOf(Integer.parseInt(Character.toString(word.charAt(i))) + 1);
				sb.setCharAt(i, numberPlusOne.charAt(0));
				return sb.toString();
			}
		}
		return sb.toString() + "(2)";
	}

	public static boolean hasDuplicatesInArray(String[] arr) {
		HashSet<String> uniqueElements = new HashSet<>();
		for (String str : arr) {
			if (!uniqueElements.add(str)) {
				return true;
			}
		}
		return false;
	}
}
