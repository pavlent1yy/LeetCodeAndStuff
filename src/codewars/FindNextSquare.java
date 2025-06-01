package codewars;

public class FindNextSquare {
	public static void main(String[] args) {
		System.out.println(findNextSquare(144));
	}

	public static long findNextSquare(long sq) {
		if (Math.sqrt(sq) % 1 == 0)
			return (long) Math.pow(Math.sqrt(sq) + 1, 2);
		return -1;
	}
}
