package Chapter4;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

			System.out.println("enter the number you want to find it's factorial: ");
			int number = scanner.nextInt();

			System.out.print("enter the number again: \n");
		int numbered = scanner.nextInt();
		           int multiplier = 1;
		for (;number  >= 1;number --) {
			multiplier = multiplier*number ;

		}
		System.out.print("The factorial of "+numbered+" is: "+multiplier+"\n");
		System.out.println();


// FINDING THE COMBNATION AND PERMUTATION USING FACTORIal

///////////// First We FInd The Total Number Which Is The "n".
		System.out.print("Enter total number: ");
		int totalNumber;

		totalNumber	= scanner.nextInt();

		int timesIt = 1;

		for (; totalNumber >= 1; totalNumber--) {
			  timesIt *= totalNumber;
		}
		System.out.println("The factorial of this input is: "+timesIt+"\n");

//////// Second We Find The Number Of Occurrence At A Time Which Is The "r".
		System.out.print("Enter number at a time: ");
		int numberAtAtime;

		numberAtAtime	= scanner.nextInt();

		int multiple = 1;

		for (; numberAtAtime >= 1; numberAtAtime--)
		{
			 multiple *= numberAtAtime;
		}
		System.out.println("The factorial of this input is: "+multiple+"\n");

//////// Next We FInd The Factorial Of The Of The DIfference of The Total Number And The Number At A Time Which is "n-r".
		int difference = totalNumber - numberAtAtime;
		int multiply = 1;
		System.out.println("The difference is: "+difference);

		for (;difference >= 1; difference--)
		{
			multiply *= difference;
		}
		System.out.println("The factorial of the difference of the inputs is: "+multiply+"\n");

		System.out.println("Enter the numbers you entered you entered again: ");
		 int userInput = scanner.nextInt();
		 int usersInput = scanner.nextInt();
		System.out.println();
/////// Then Finally We Find The Combination Of The Total Number And Number AT A Time
		int combination = (timesIt)/((multiply) * multiple);
		System.out.println("The combination of "+userInput+" and "+usersInput+" is "+combination);
	}
////// Then Finally We find The Permutation Of The Total Number And The Number At A Time

}


