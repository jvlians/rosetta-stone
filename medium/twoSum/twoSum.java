import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class twoSum {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a series of integers separated by spaces: ");
		String[] input = scan.nextLine().split(" ");
		System.out.print("Enter the integer sum to search for: ");
		int target = scan.nextInt();

		int[] nums = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			nums[i] = Integer.parseInt(input[i]);
		}

		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hash.containsKey(target-nums[i])) {
				return new int[]{hash.get(target-nums[i]),i};
			} else {
				hash.put(nums[i], i);
			}
		}
		return new int[]{0,0};
	}
}