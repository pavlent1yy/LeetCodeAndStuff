package codewars;

import java.util.stream.IntStream;

public class Between {
	public static void main(String[] args) {
		int[] d = between(2, 4);
		for (int i = 0; i < d.length; i++)
			System.out.println(d[i]);
	}

	public static int[] between(int a, int b) {
		return IntStream.rangeClosed(a, b).toArray();
	}

}