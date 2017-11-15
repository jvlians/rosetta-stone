import java.util.Scanner;

public class fibonacci {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer greater than 0: ");
		System.out.println(fib_iter(scan.nextInt()));
	}

	public static int fib_iter(int n) {
		int prev = 1;
		int curr = 0;
		for (int i = 1; i <= n; i++) {
			int temp = curr;
			curr += prev;
			prev = temp;
		}
		return curr;
	}

	public static int fib_recur(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fib_recur(n-1)+fib_recur(n-2);
	}
}