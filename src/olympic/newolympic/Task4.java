package olympic.newolympic;

public class Task4 {
	public static void main(String[] args) {
		System.out.println("a b c d e | Result");
		System.out.println("------------");

		for (int i = 0; i < 32; i++) {
			int a = (i >> 1) & 1;
			int b = (i >> 2) & 1;
			int c = (i >> 3) & 1;
			int d = (i >> 4) & 1;
			int e = i & 1;
			boolean result = (c == 1 || (a == 1 || b == 1) && d == 1 || e == 1); // a OR b
			System.out.printf("%d %d %d %d %d | %d%n", a, b, c, d, e, result ? 1 : 0);
		}
	}

}
