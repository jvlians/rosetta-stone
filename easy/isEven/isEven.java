import java.util.Scanner;

public class isEven {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = scan.nextInt();
		System.out.println(isEven(n));
	}

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
}