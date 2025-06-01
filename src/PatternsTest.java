import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsTest {
	public static void main(String[] args) {
		String text = "JavaSE; Java19 the best. JavaScript!";
		Matcher matcher = Pattern.compile(".*\\bJava\\w.*").matcher(text);
		Matcher matcher1 = Pattern.compile("Java").matcher(text);

		System.out.println(matcher.matches());
		System.out.println(matcher1.find());
	}
}
