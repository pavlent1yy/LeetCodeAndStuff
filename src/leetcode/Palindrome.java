package leetcode;

public class Palindrome {
	public static void main(String[] args) {
		// System.out.println(isPalindrome("Was it a car or a cat I saw?"));
		// System.out.println(isPalindrome("tab a cat"));
		System.out.println(isPalindrome("Madam, in Eden, I'm Adam"));
	}

	public static boolean isPalindrome(String s) {
		String result = s.replaceAll("['-+.^:,?!]", "").toLowerCase();
		String[] strings = result.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String el : strings)
			sb.append(el);
		return sb.toString().equals(sb.reverse().toString());
	}
}
