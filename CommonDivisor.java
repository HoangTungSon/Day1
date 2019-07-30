import java.util.Scanner;

public class CommonDivisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num1 = sc.nextInt();

		System.out.println("Enter the number");
		int num2 = sc.nextInt();

		int maxCommonDivisor = 0;

		for (int i = 2; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				maxCommonDivisor = i;
			}
		}

		System.out.println(maxCommonDivisor);

	}
}
