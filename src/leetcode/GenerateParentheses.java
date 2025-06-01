package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public static void main(String[] args) {
		System.out.println(generateParenthesis(1)); // ["()"]
		System.out.println(generateParenthesis(2)); // ["(())","()()"]
		// 0011 0101
		System.out.println(generateParenthesis(3)); //
		// ["((()))","(()())","(())()","()(())","()()()"]
		// 000111 001011 001101 010011 010101
	}

	public static List<String> generateParenthesis(int n) {
		List<String> resList = new ArrayList<>();
		backtrack(resList, "", 0, 0, n);
		return resList;
	}

	private static void backtrack(List<String> resList, String current_string, int open, int close, int max) {
		if (current_string.length() == max * 2) {
			resList.add(current_string);
			return;
		}
		if (open < max)
			backtrack(resList, current_string + "(", open + 1, close, max);
		if (close < open)
			backtrack(resList, current_string + ")", open, close + 1, max);
	}

}
