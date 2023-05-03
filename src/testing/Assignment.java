package testing;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNed {


	Scanner scanner = new Scanner(System.in);

	void input() {
		int[] grades = new int[5];

		int maximum;
		int sum = 0;

		int maxee = Integer.MIN_VALUE;
		for (int counters = 0; counters < grades.length; counters++) {
			System.out.println("enter the grades");
			grades[counters] = scanner.nextInt();

			maxee = Math.max(maxee, grades[counters]);
			sum += grades[counters];
		}
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);

		}
		System.out.println("The maximum is: " + maxee);

		System.out.println("The sum of the elements in the array: " + sum);

	}
}
