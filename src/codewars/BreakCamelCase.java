package codewars;

public class BreakCamelCase {
	public static void main(String[] args) {
		System.out.println(camelCase("camelCasingTest"));
		System.out.println(camelCase("camelcasingtest"));
	}

	public static String camelCase(String input) {
		StringBuilder inputSB = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (Character.isUpperCase(c)) {
				inputSB.append(" ");
			}
			inputSB.append(c);
		}
		return inputSB.toString();
	}
}
