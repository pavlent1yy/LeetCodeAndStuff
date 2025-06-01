package olympic.old;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(palindromeAddition("qwerttr"))); // 3, ewq .|---> qwerttrewq
		System.out.println(Arrays.toString(palindromeAddition("qwertHtr"))); // "нечетная" строка
		System.out.println(Arrays.toString(palindromeAddition("asdfgfdsa"))); // 0. т.к строка уже палиндром
		System.out.println(Arrays.toString(palindromeAddition("arrrtrr"))); // 2, ra
		System.out.println(Arrays.toString(palindromeAddition("arrrttr"))); // 3, rra
		System.out.println(Arrays.toString(palindromeAddition("arrrtr"))); // 3, rra

	}

	public static Object[] palindromeAddition(String str) {
		if (isPalindrome(str))
			return new Object[] { 0 };
		else {
			Object[] asnwer = new Object[2];
			try {
				String strFirstPart = "";
				String strSecondPart = "";
				String strCopy = str;
				for (int i = 0; i < str.length(); i++) {
					if (isPalindrome(strCopy.substring(i, i + 4))) {
						strSecondPart = strCopy.substring(i + 2, i + 4);
						strFirstPart = strCopy.replaceAll(strSecondPart, "");
						break;
					}

					if (isPalindrome(strCopy.substring(i, i + 5))) {
						strCopy = strCopy.replaceAll(Character.toString(str.charAt((i + i + 5) / 2)), "");
						strSecondPart = strCopy.substring(i + 2, i + 4);
						strFirstPart = strCopy.replaceAll(strSecondPart, "");
						break;
					}

				}
				String addition = reverseString(strFirstPart.replaceAll(reverseString(strSecondPart), "")).trim();
				asnwer[0] = addition.length();
				asnwer[1] = addition;
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.print("Palindrome addition is imposible: ");
				return new Object[] { -1 };
			}
			return asnwer;
		}
	}

	public static boolean isPalindrome(String str) {
		return str.equals(reverseString(str));
	}

	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
/*
 * -------------------------------------------------
 * 
 * 1. "qwerttr"
 * qwert | tr
 * 
 * Если tr - перевернутая подстрока qwert,
 * 
 * tr -> rt --> qweRT
 * 
 * то мы вычитаем у qwert rt, выводи его длинну, и перевернутую подстроку
 * 
 * qwert - rt = qwe ---> eqw
 * 
 * 
 * 2. "qwertHtr" Если полиндром "нечетный",
 * то мы удаляем мешающий элемент "H" и повторяем действия из пункта 1
 * 
 * 
 * 
 * ------------------------------------------------
 */