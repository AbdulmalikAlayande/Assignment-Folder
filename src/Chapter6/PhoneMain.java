package Chapter6;

import java.util.Scanner;

public class NokiaMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		      Nokia nokia3310 = new Nokia();

		System.out.println(nokia3310.displayMenu());
			  int userInput = scanner.nextInt();
					if (userInput == 2) {
						  nokia3310.MessageMenu();
					} else if (userInput == 3) {
						  nokia3310.callRegisterMenu();
					} else if (userInput == 4) {
						nokia3310.settingsMenu();
					}
					else System.out.println("invalid input");

		System.out.println("Do you wish to continue"); 
		
		String userChoice = scanner.nextLine();
	}
}
