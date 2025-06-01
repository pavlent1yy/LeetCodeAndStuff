package codewars;

public class VowelCount {
	public static void main(String[] args) {
		System.out.println(getCount("abracadabra")); // 5
		System.out.println(getCount("")); // 0
		System.out.println(getCount("pear tree")); // 4
		System.out.println(getCount("o a kak ushakov lil vo kashu kakao")); // 13
	}

	public static int getCount(String str) {
		char[] strList = str.toCharArray();
		int count = 0;
		for (char ch : strList) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
}
