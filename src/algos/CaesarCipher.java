package algos;

public class CaesarCipher {
	public static void main(String[] args) {
		System.out.println(ces("Hello world", 1));
		System.out.println(ces("Ifmmp!xpsme", -1));
		System.out.println(ces("ABC", 2)); // BCD
		System.out.println(ces("Привет", 2));
		System.out.println(ces("Сткдзф", -2));
	}

	public static String ces(String string, int key) {
		char[] stringToChar = string.toCharArray();
		for (int i = 0; i < stringToChar.length; i++) {
			stringToChar[i] = (char) ((int) (string.charAt(i)) + key);
		}
		return new String(stringToChar);
	}
}
