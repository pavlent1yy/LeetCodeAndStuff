import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
		List<List<String>> res = new ArrayList<>(strs.length);
		res.add(new ArrayList<String>());
		res.get(0).add(strs[0]);
		res.get(0).add(strs[1]);
		System.out.println(res);
	}
}
