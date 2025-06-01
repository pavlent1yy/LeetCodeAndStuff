package codewars;

public class NeedleHaystack {
	public static String findNeedle(Object[] haystack) {
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i] != null && haystack[i].equals("needle"))
				return "found the needle at position " + i;
		}
		return "-1";
	}
}