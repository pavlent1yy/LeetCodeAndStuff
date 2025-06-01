package codewars;

public class StopgninnipSMysdroW {
	public static void main(String[] args) {
		System.out.println(spinWords("Hey fellow warriors"));
		System.out.println(spinWords("Just gniddik [ereht is llits] one more"));
	}

	public static String spinWords(String sentence) {
		String[] sencenceByWords = sentence.split(" ");
		String finalSentecne = "";
		for (String word : sencenceByWords) {
			if (word.length() > 5) {
				finalSentecne = finalSentecne + new StringBuilder(word).reverse() + " ";
			} else {
				finalSentecne = finalSentecne + word + " ";
			}
		}
		return finalSentecne.trim();
	}
}
