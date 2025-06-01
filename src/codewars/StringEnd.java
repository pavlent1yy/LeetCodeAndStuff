package codewars;

public class StringEnd {
	public static void main(String[] args) {
		System.out.println("8. " + solution("abcabc", "")); // true
		System.out.println("1. " + solution("samurai", "ai")); // true
	}

	public static boolean solution(String str, String ending) {
		// String[] strArr = str.split(ending);
		// return (strArr.length <= 0 || ending.length() <= 0 || strArr.length == 1 &&
		// str != strArr[0]
		// || strArr[0] != strArr[1]);
		return str.endsWith(ending);
	}

}
