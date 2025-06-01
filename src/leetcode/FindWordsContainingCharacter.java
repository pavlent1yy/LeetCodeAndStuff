package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
	public static void main(String[] args) {
		System.out.println(findWordsContaining(new String[] { "leet", "code" }, 'e'));
		System.out.println(findWordsContaining(new String[] { "abc", "bcd", "aaaa", "cbc" }, 'a'));
	}

	public static List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].indexOf(x) >= 0)
				result.add(i);
		}
		return result;
	}

}
