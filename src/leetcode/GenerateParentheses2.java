package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses2 {
	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
	}

	public static List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<>();
		Stack<Character> stack = new Stack<>();
		backtrack(n, 0, 0, stack, res);
		return res;
	}

	private static void backtrack(int n, int open, int close, Stack<Character> stack, List<String> res) {
		if (open == close && open == n) {
			StringBuilder sb = new StringBuilder();
			for (char ch : stack) {
				sb.append(ch);
			}
			res.add(sb.toString());
			return;
		}

		if (open < n) {
			stack.push('(');
			backtrack(n, open + 1, close, stack, res);
			stack.pop();
		}
		if (open > close) {
			stack.push(')');
			backtrack(n, open, close + 1, stack, res);
			stack.pop();
		}
	}
}
