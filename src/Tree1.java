public class Tree1 {
	public static void main(String[] args) {
		Tree root = new Tree(20,
				new Tree(7,
						new Tree(4, null,
								new Tree(6, null, null)),
						new Tree(9,
								new Tree(12, null, null),
								new Tree(67, null, null))),
				new Tree(35,
						new Tree(6, new Tree(31,
								new Tree(12, null, null),
								new Tree(48,
										new Tree(38, null, null), null)),
								null),
						null));

		System.out.println(root.sumTree());
	}
}

class Tree {
	int value;
	Tree left;
	Tree right;

	public Tree(int value, Tree left, Tree right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public int sumTree() {
		int summ = value;

		if (left != null) {
			summ += left.sumTree();
		}

		if (right != null) {
			summ += right.sumTree();
		}

		return summ;
	}
}
