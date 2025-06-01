package leetcode;

public class LengthOfLastWord {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));
	}

	public static int lengthOfLastWord(String s) {
		String[] splitedStrig = s.split(" ");
		return splitedStrig[splitedStrig.length - 1].length();
	}
}
