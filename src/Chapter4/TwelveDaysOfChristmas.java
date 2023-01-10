package Chapter4;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter 1 to start(when you are done enter 0): ");
		int days = input.nextInt();

		while (days != 0){
			System.out.println("Enter the day you want to read: ");
			 days = input.nextInt();

			 switch (days) {
				 case 1:
					 days = 1;
					 break;
				 case 2:
					 days = 2;
					 break;
				 case 3:
					 days = 3;
					 break;
				 case 4:
					 days = 4;
					 break;
				 case 5:
					 days = 5;
					 break;
				 case 6:
					 days = 6;
					 break;
				 case 7:
					 days = 7;
					 break;
				 case 8:
					 days = 8;
					 break;
				 case 9:
					 days = 9;
					 break;
				 case 10:
					 days = 10;
					 break;
				 case 11:
					 days = 11;
					 break;
				 case 12:
					 days = 12;
					 break;
				 default:
					 System.out.println("invalid: ");
			 }
		}
	}
}
