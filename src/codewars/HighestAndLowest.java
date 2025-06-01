package codewars;

import java.util.Arrays;

public class HighestAndLowest {
	public static void main(String[] args) {
		System.out.println(highAndLow("1 2 3 4 5"));
	}

	public static String highAndLow(String numbers) {
		int max = Arrays.stream(numbers.split(" ")).mapToInt(el -> Integer.parseInt(el)).max().getAsInt();
		int min = Arrays.stream(numbers.split(" ")).mapToInt(el -> Integer.parseInt(el)).min().getAsInt();
		return String.format("%d %d", min, max);
	}
}
