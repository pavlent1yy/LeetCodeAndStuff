package codewars;

public class ComparePowers {
	public static void main(String[] args) {
		System.out.println(comparePowers(new int[] { 6, 900 }, new int[] { 5, 1000
		})); // -1
		// System.out.println(comparePowers(new int[] { 2, 10 }, new int[] { 2, 10 }));
		// // 0
	}

	public static int comparePowers(int[] number1, int[] number2) {
		Long pow1 = (long) Math.pow(number1[0], number1[1]);
		Long pow2 = (long) Math.pow(number2[0], number2[1]);
		System.out.println(pow1.equals(pow2));
		System.out.println(pow1);
		System.out.println(pow2);
		if (pow1.equals(pow2))
			return 0;
		return pow1 / 100 < pow2 / 100 ? 1 : -1;
	}
}
