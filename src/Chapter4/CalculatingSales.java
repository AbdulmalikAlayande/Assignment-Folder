package Chapter4;

import java.util.Scanner;

public class CalculatingSales {

	public int house(){
		return 0;
	}
	public static void main(String[] args) {

		Scanner sale = new Scanner(System.in);

			int counter1 = 0;	int counter2 = 0;
			int counter3 = 0;	int counter4 = 0;
			int counter5 = 0;	int productCounter = 0;
			double totalRetailValue = 0;

				System.out.print("Enter 1 to start (when you are done enter 0 to stop): ");
				int productNumber = sale.nextInt();
				System.out.println();

				double retailPrice = 0;

		while (productNumber != 0){
			System.out.print("Enter product number: ");
			productNumber = sale.nextInt();
			++productCounter;
			 if (productNumber > 0) {

				 if (productNumber < 6) {

					 switch (productNumber) {
						 case 1:
							 retailPrice = 2.98;
							 ++counter1;
							 break;
						 case 2:
							 retailPrice = 4.50;
							 ++counter2;
							 break;
						 default:
							 System.out.println("Invalid product number");
							 break;
						 case 3:
							 retailPrice = 9.98;
							 ++counter3;
							 break;
						 case 4:
							 retailPrice = 4.49;
							 ++counter4;
							 break;
						 case 5:
							 retailPrice = 6.87;
							 ++counter5;
							 break;
					 }

					 System.out.println("The retail price for product " + productNumber + " is: $" + retailPrice);


					 System.out.print("how many product " + productNumber + " did you sell: ");
					 int amountSold = sale.nextInt();

					 double particularAmountSold = retailPrice * amountSold;
					 System.out.println("The total sales on product " + productNumber + " is: $" + particularAmountSold+"\n");
					 totalRetailValue += particularAmountSold;
				 }
				 else System.out.println("please enter a valid product number\n");
			 }
			 else System.out.println("Thanks for your patronage");
		}
		System.out.println("The total number of products sold is: "+productCounter);
		System.out.println("The total retail value of all products sold are: "+totalRetailValue);
	}
}
