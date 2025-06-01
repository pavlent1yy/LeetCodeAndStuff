package codewars;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
	public static void main(String[] args) {
		List<Object> arr = filterList(List.of(1, 2, "a", "b"));
		System.out.println(arr);
	}

	public static List<Object> filterList(final List<Object> list) {
		// -----------------------First Solution-----------------------

		// List<Integer> filtredList = new ArrayList<>();
		// for (Object el : list) {
		// if (el instanceof Integer)
		// filtredList.add((Integer) el);
		// }
		// List<Object> newfiltredList = new ArrayList<>();
		// newfiltredList.addAll(filtredList);
		// return newfiltredList;

		// -----------------------Second Solution-----------------------
		return list.stream().filter(el -> el instanceof Integer).collect(Collectors.toList());
	}
}
