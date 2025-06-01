package codewars;

import static java.util.stream.IntStream.of;

public class MissingTermArithmeticProgression {
	public static void main(String[] args) {
		System.out.println(findMissing(new int[] { 1, 3, 5, 9, 11 }));
	}

	public static int findMissing(int[] numbers) {
		if (numbers[0] != numbers[numbers.length - 1]) {
			int diff = numbers[numbers.length - 1] - numbers[numbers.length - 2];
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] + diff != numbers[i + 1])
					return numbers[i] + diff;
			}
		}
		return numbers[0];
	}

	public static int findMissingClever1(int[] numbers) {
		return (numbers[0] + numbers[numbers.length - 1]) * (numbers.length + 1) / 2 - of(numbers).sum();
	}

	public static int findMissingClever2(int[] numbers) {
		final int diffNumber = numbers[1] - numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] == numbers[i - 1] || numbers[i - 1] + diffNumber != numbers[i])
				return numbers[i] - diffNumber;
		}
		return 0;
	}

}
