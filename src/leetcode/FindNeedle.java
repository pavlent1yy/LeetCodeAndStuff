package leetcode;

public class FindNeedle {
	public static void main(String[] args) {
		System.out.println(strStr("sadbutsad", "sad"));
		System.out.println(strStr("leetcode", "leeto"));

	}

	public static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
}
