package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

	public static void main(String[] args) {
		System.out.println(letterCombinations("2")); // ["a","b","c"]
		System.out.println(letterCombinations("23")); //
		// ["ad","ae","af","bd","be","bf","cd","ce","cf"]
		System.out.println(letterCombinations("")); // []
		System.out.println(letterCombinations("234"));
		System.out.println(letterCombinations("2345"));
		// ["adg","adh","adi","aeg","aeh","aei","afg","afh","afi","bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi","cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi"]
	}

	final static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
			{ 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

	public static List<String> letterCombinations(String digits) {
		int len = digits.length();
		List<String> finalList = new ArrayList<>();
		if (len == 0)
			return finalList;
		bfs(0, len, new StringBuilder(), finalList, digits);
		return finalList;
	}

	public static void bfs(int pos, int len, StringBuilder sb, List<String> finalList, String digits) {
		if (pos == len)
			finalList.add(sb.toString());
		else {
			char[] letters = L[Character.getNumericValue(digits.charAt(pos))];
			for (int i = 0; i < letters.length; i++)
				bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), finalList, digits);
		}
	}

	// public static List<String> letterCombinations(String digits) {
	// if (digits == null || digits.equals("")) {
	// return Arrays.asList();
	// }
	// HashMap<String, List<String>> phoneKeyboard = new HashMap<>();
	// phoneKeyboard.put("2", Arrays.asList("a", "b", "c"));
	// phoneKeyboard.put("3", Arrays.asList("d", "e", "f"));
	// phoneKeyboard.put("4", Arrays.asList("g", "h", "i"));
	// phoneKeyboard.put("5", Arrays.asList("j", "k", "l"));
	// phoneKeyboard.put("6", Arrays.asList("m", "n", "o"));
	// phoneKeyboard.put("7", Arrays.asList("p", "q", "r", "s"));
	// phoneKeyboard.put("8", Arrays.asList("t", "u", "v"));
	// phoneKeyboard.put("9", Arrays.asList("w", "x", "y", "z"));
	// List<String> finalList = new ArrayList<String>();
	// if (phoneKeyboard.containsKey(digits)) {
	// return phoneKeyboard.get(digits);
	// } else {
	// for (int i = 0; i < digits.length(); i++) {
	// StringBuilder sb = new
	// StringBuilder(phoneKeyboard.get(Character.toString(digits.charAt(0))).get(0));
	// sb.append(concatinate(sb, digits, finalList, phoneKeyboard, i));
	// finalList.add(sb.toString());

	// // StringBuilder sb = new
	// //
	// StringBuilder(phoneKeyboard.get(Character.toString(digits.charAt(0))).get(i));
	// // for (int j = 0; j <
	// // phoneKeyboard.get(Character.toString(digits.charAt(i))).size(); j++) {
	// // StringBuilder sb1 = new StringBuilder(
	// // phoneKeyboard.get(Character.toString(digits.charAt(1))).get(j));
	// // for (int k = 0; k <
	// // phoneKeyboard.get(Character.toString(digits.charAt(j))).size(); k++) {
	// // StringBuilder sb2 = new StringBuilder(
	// // phoneKeyboard.get(Character.toString(digits.charAt(2))).get(k));
	// // finalList.add(sb.toString() + sb1.toString() + sb2.toString());
	// // }
	// // }

	// }
	// }
	// return finalList;
	// }

	// public static String concatinate(StringBuilder sb, String digits,
	// List<String> finalList,
	// HashMap<String, List<String>> phoneKeyboard, int index) {

	// sb = new
	// StringBuilder(phoneKeyboard.get(Character.toString(digits.charAt(0))).get(index));
	// return sb.toString();
	// }

}
