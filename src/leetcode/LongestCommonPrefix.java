package leetcode;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		// System.out.println(longestCommonPrefix(new String[] { "flower", "flow",
		// "flight" }));
		System.out.println(longestCommonPrefix(new String[] { "a" }));
		System.out.println(longestCommonPrefix(new String[] { "" }));
	}

	public static String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; isInputLetterSame(strs[0].charAt(i), i, strs); i++) {
			sb.append(strs[0].charAt(i));
		}
		return sb.toString();
	}

	public static boolean isInputLetterSame(char letter, int letterPosition, String[] strs) {
		boolean isLetterSame = true;
		for (int i = 1; i < strs.length; i++) {
			isLetterSame = letter == strs[i].charAt(letterPosition);
		}
		return isLetterSame;
	}
}
