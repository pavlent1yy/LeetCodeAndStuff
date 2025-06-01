package leetcode;

public class IsPalindrome {
	public static void main(String[] args) {
		// System.out.println(isPalindrome("101"));
		// System.out.println(isPalindrome("BOB"));
		// System.out.println(isPalindrome("oPo"));
		// System.out.println(isPalindrome("ollo"));

		System.out.println(new StringBuilder("улыбок тебе дед макар").reverse());
	}

	public static boolean isPalindrome(String string) {
		return string.equals(new StringBuilder(string).reverse().toString());
	}

	public static boolean ispalindromeLong(long number) {
		return Long.toString(number).equals(new StringBuilder(Long.toString(number)).reverse().toString());
	}

	public static boolean isPalindromeInt(int x) {
		return Integer.toString(x).equals(new StringBuilder(Integer.toString(x)).reverse().toString());
	}
}
