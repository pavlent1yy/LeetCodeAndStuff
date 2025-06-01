package codewars;

public class ValidatePin {
	public static void main(String[] args) {
		System.out.println(validatePin(""));
	}

	public static boolean validatePin(String pin) {
		boolean isCorrect = true;
		if (pin.length() != 4 || pin.length() != 6) {
			isCorrect = pin.matches("[0-9]{1,}");
		} else {
			isCorrect = true;
		}
		return isCorrect;
	}
}
