package Chapter4;

import java.util.Scanner;

public class Comparator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int counter = 1;

			System.out.print("enter first number: ");
			int number = input.nextInt();

			int largest = number;
			int smallest = number;

			while (number != 0) {
				counter = counter + 1;
				System.out.print("enter next number: ");
				number = input.nextInt();
				if (largest > number) {
					number = largest;
					System.out.println(largest+" is the largest");
				} else if (smallest < number) {
					 number = smallest;
					System.out.println(smallest+" is the smallest");
				}
				
//				int firstNumber = input.nextInt();
//
//				System.out.print("enter second number: ");
//				int secondNUmber = input.nextInt();
//
//				if (firstNumber == secondNUmber){
//					System.out.println("0: 		"+ firstNumber+" is equal to "+secondNUmber);
//					System.out.println();
//
//				}
//				else if (firstNumber < secondNUmber) {
//					System.out.println("1: 		"+ secondNUmber+" is greater than "+firstNumber);
//					System.out.println();
//				}
//				else{
//					System.out.println("-1: 	"+ firstNumber+" is greater than "+secondNUmber);
//					System.out.println();
//				}
//					System.out.println("you can do it again for any other number(PRESS CTRL + D TO Stop)");
//				System.out.println("enter first number: ");
//				counter++;

			}
	}
}
