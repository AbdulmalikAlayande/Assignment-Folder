package Chapter4;

import java.util.Scanner;

public class CompoundInterestProgram {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range of year you want to print it's five to ten percent interest: ");
		int years = scanner.nextInt();


		double rate = 5.0/100.0;
		double principal = 1000.00;

		System.out.printf("%s%n","Year 	5percent 			6percent 			7percent 			8percent 			9percent	 		10percent");
		System.out.print("=====================================================================================================================");
		System.out.println();
		for(	int year = 1;year <= years; year++) {
			System.out.printf("%d",year);
			for (rate = 0.05; rate <= 0.10; ) {
				double amount = principal * Math.pow((1 + rate), year);
				double centPortions = amount % 1;

				System.out.printf(" 		%.2f 	", amount);//, centPortions);
				rate+=0.01;
			}
			System.out.println();

		}
		System.out.println(Math.max(23, 4));
		System.out.println(Math.min(43,23));
	}
}
