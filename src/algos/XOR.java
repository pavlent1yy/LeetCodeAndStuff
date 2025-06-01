package algos;

public class XOR {
	public static void main(String[] args) {
		System.out.println(xor(true, true)); // false
		System.out.println(xor(true, false)); // true
		System.out.println(xor(false, true)); // true
		System.out.println(xor(false, false)); // false
	}

	public static boolean xor(boolean b1, boolean b2) {
		if (b1 && b2)
			return false;
		else if (b1 || b2)
			return true;
		return false;
	}
}