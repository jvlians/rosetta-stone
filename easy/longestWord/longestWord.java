import java.util.Scanner;

public class longestWord {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		System.out.println(longestWord(scan.nextLine()));
	}

	public static String longestWord(String sentence) {
		String longest = "";
		int max = 0;
		for (String word : sentence.split(" ")) {
			String temp = "";
			int count = 0;
			for (char c : word.toCharArray()) {
				if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
					count++;
					temp += c;
				}
			}
			if (count > max) {
				longest = temp;
				max = count;
			}
		}
		return longest;
	}
}