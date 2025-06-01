import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				numbers.add(i);
		}
		System.out.println(plusOnetoEach(numbers));

	}

	public static List<Integer> plusOnetoEach(List<Integer> array) {
		return array.stream().map(el -> el + 2).collect(Collectors.toList());
	}
}
