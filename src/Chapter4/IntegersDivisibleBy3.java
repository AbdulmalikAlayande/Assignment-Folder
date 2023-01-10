package Chapter4;

import java.util.Scanner;

public class IntegersDivisibleBy3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the range of "+"\"n\""+ " between 1 and 100: ");
		long n = input.nextLong();

			int sum = 0;   int counter = 1;  int num = counter;
		if (n >= 1 && n <= 100) {
			while (n > 0 && n != 0) {
				System.out.println("Enter the range of "+"\"n\""+ " between 1 and 100: ");
				n = input.nextLong();

				sum += counter;
				counter++;
			}
			System.out.printf("%10s%30s%n", "N", "Corresponding sum");
			System.out.printf("%10d%20d%n", n, sum);
		}
	}
}
