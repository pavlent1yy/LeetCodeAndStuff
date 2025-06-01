package leetcode;

public class ProductofArrayExceptSelf {
	public static void main(String[] args) {
		productExceptSelf(new int[] { 0, 0 });
	}

	static public int[] productExceptSelf(int[] nums) {
		int[] answer = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int answerEl = 1;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] != nums[i]) {
					answerEl *= nums[j];
				}

			}
			answer[i] = answerEl;
		}
		return answer;
	}
}