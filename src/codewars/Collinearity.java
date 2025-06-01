package codewars;

public class Collinearity {
	public static void main(String[] args) {
		System.out.println(collinearity(1, 1, -1, -1)); // true
		System.out.println(collinearity(0, 1, 6, 0)); // false
		System.out.println(collinearity(-906, -593, 656, 308)); // false
	}

	public static boolean collinearity(int x1, int y1, int x2, int y2) {
		return y1 == 0 || x1 == 0 || y2 == 0 || x2 == 0 || (x1 / x2) == (y1 / y2);

	}
}
