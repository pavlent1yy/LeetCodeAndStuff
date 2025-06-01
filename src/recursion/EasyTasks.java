package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EasyTasks {
	public static void main(String[] args) {
		// System.out.println(task1(2, 3)); // 8
		// System.out.println(findMax(new int[] { 2, 64, 5, 5, 26, 7, 9 }, 0, 0)); // 64
		// System.out.println(sumElements(new int[] { 2, 64, 5, 5, 26, 7, 9 }, 0, 0));
		// // 118

		printReversedDigits(-125);
		System.out.println(countDigits(124));
		System.out.println(isSotred(new int[] { 1, 2, 6, 4, 5 }));
		System.out.println(findFirst(new int[] { 1, 2, 6, 4, 5 }, 9));
		generateParentheses(3);
		// generatePermutations("can"); // can, cna, anc, acn, nac, nca
		// --- 012, 021, 102, 120, 201, 210
	}

	public static boolean isSotred(int[] array) {
		return isSorted(array, 0, 1);
	}

	public static int findFirst(int[] array, int target) {
		return findFirst(array, target, 0);
	}

	public static void generateParentheses(int n) {
		List<String> res = new ArrayList<>();
		Stack<Character> stack = new Stack<>();
		generateParentheses(n, 0, 0, stack, res);
		System.out.println(res);
		// generatePermutations("can", "");
		generateCombinations("abc", "", 0);
	}

	// public static void generatePermutations(String string) {
	// List<String> list = new ArrayList<>();
	// generatePermutations(string, list);
	// System.out.println(list);
	// }

	// * ---------------------------------------------
	public static void printReversedDigits(int n) {
		int abs = Math.abs(n);
		int lastDigit = abs % 10;
		if (n == 0) {
			System.out.println();
			return;
		}
		System.out.print(lastDigit);
		printReversedDigits((abs - lastDigit) / 10);
	}

	public static int countDigits(int n) {
		if (n < 10)
			return 1;
		return 1 + countDigits(n / 10);
	}

	public static boolean isSorted(int[] array, int index, int nextIndex) {
		if (array[index] > array[nextIndex])
			return false;
		if (array.length - 1 == nextIndex)
			return true;
		return isSorted(array, nextIndex, nextIndex + 1);
	}

	public static int findFirst(int[] array, int target, int index) {
		if (array[index] == target)
			return index;
		if (index == array.length - 1)
			return -1;
		return findFirst(array, target, index + 1);
	}

	public static void generateParentheses(int n, int open, int close, Stack<Character> stack, List<String> list) {
		if (open == close && open == n) {
			StringBuilder sb = new StringBuilder();
			for (char el : stack)
				sb.append(el);
			list.add(sb.toString());
		}

		if (open < n) {
			stack.push('(');
			generateParentheses(n, open + 1, close, stack, list);
			stack.pop();
		}

		if (close < open) {
			stack.push(')');
			generateParentheses(n, open, close + 1, stack, list);
			stack.pop();

		}

	}

	public static void generatePermutations(String string, String result) {
		if (string.isEmpty()) {
			System.out.println(result);
			return;
		}
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			String temp = string.substring(0, i) + string.substring(i + 1);
			generatePermutations(temp, result + ch);
		}
	}

	public static void generateCombinations(String str, String result, int index) {
		if (index == str.length()) {
			if (!result.isEmpty()) { // Печатаем только непустые комбинации
				System.out.println(result);
			}
			return;
		}
		generateCombinations(str, result + str.charAt(index), index + 1);
		generateCombinations(str, result, index + 1);
	}

	public static void findSubsetSums(int[] array, int index, int currentSum) {

	}

	// public static int task1(int a, int b) {
	// if (b == 0)
	// return 1;
	// return a * task1(a, b - 1);
	// }

	// public static int findMax(int[] array, int index, int maxIndex) {
	// if (array.length <= index)
	// return array[maxIndex];
	// if (array[index] > array[maxIndex])
	// maxIndex = index;
	// return findMax(array, index + 1, maxIndex);
	// }

	// public static int sumElements(int[] array, int index, int sum) {
	// if (array.length <= index)
	// return sum;
	// sum += array[index];
	// return sumElements(array, index + 1, sum);
	// }

}
