package olympic.old;

import java.util.Arrays;

public class Task1 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(hotelProblem(7)));// 2 1
		System.out.println(Arrays.toString(hotelProblem(6)));// 0 2
		System.out.println(Arrays.toString(hotelProblem(8)));// 1 2
		System.out.println(Arrays.toString(hotelProblem(11)));// 1 3
		System.out.println(Arrays.toString(hotelProblem(13)));// 2 3
		System.out.println(Arrays.toString(hotelProblem(15)));// 0 5
		System.out.println(Arrays.toString(hotelProblem(18)));// 0 6

		hotel(7);// 2 1
		hotel(6);// 0 2
		hotel(8);// 1 2
		hotel(11);// 1 3
		hotel(13);// 2 3
		hotel(15);// 0 5
		hotel(18);// 0 6
	}

	public static int[] hotelProblem(int n) {
		for (int room3 = n / 3; room3 >= 0; room3--) {
			if ((n - 3 * room3) % 2 == 0) {
				int room2 = (n - 3 * room3) / 2;
				return new int[] { room2, room3 };
			}
		}
		return new int[] { -1, -1 };
	}

	public static int hotel(int n) {
		int j = n - (n % 3);
		if (j == n)
			System.out.println(n / 3 + " " + 0);
		else
			System.out.println(n / 3 + " " + 1);
		return 0;
	}

}
