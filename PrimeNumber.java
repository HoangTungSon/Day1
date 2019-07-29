import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter the number to check if it's a prime or not");
		
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		boolean check = true;

		if (number < 2) {
			check = false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {

				check = false;
			}
		}

		if (check) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");

		}

	}

}
