import java.util.Scanner;

public class fizzBuzz {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer greater than 0: ");
		System.out.println(fizzBuzz(scan.nextInt()));
	}

	public static String fizzBuzz(int n) {
		String output = "";
		for (int i = 1; i <= n; i++) {
			String temp = "";
			if (i % 3 == 0) {
				temp += "Fizz";
			}
			if (i % 5 == 0) {
				temp += "Buzz";
			}
			if (temp.length() == 0) {
				temp += i;
			}
			output += temp+"\n";
		}
		return output;
	}
}