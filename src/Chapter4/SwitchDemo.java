package Chapter4;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner toyinde = new Scanner(System.in);

		// we are tryng to find the value of a month entered by the user.
		System.out.println("Enter the number position of the month");
		int month = toyinde.nextInt();
		String monthName;
		switch (month){
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				break;
			case 12:
				monthName = "December";
				break;
			default:
				monthName = "Invalid Month";

		}
		System.out.println(monthName);



				System.out.print("enter product number: ");
				int productNumber = toyinde.nextInt();
				double retailPrice = 0;

				switch (productNumber){
					case 1:
						retailPrice = 2.98;
						break;
					case 2:
						retailPrice = 4.50;
						break;
					case 3:
						retailPrice = 9.98;
						break;
					case 4:
						retailPrice = 4.49;
						break;
					case 5:
						retailPrice = 6.87;
						break;
					default:
						System.out.println("invalid retail price");

				}
		System.out.println("The retail price for product "+productNumber+" is: "+retailPrice);
		System.out.println("how many product "+ productNumber+ " did you sell");
		int amountSold = toyinde.nextInt();


		    }
		}
//System.out.println("Enter the number position of the month");
//		int Momth = toyinde.nextInt();
//
//		        int year = 2000;
//		        int numDays = 0;
//
//		        switch (Momth) {
//						case 1:
//						case 3:
//							case 5:
//		           	 	case 7:
//						case 8:
//							case 10:
//		            	case 12:
//
//		                numDays = 31;
//		                break;
//
//
//		            case 4:
//						case 6:
//		            case 9:
//						case 11:
//		                numDays = 30;
//		                break;
//		            case 2:
//		                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
//							numDays = 29;
//						}
//		                else {
//							numDays = 28;
//						}
//		                break;
//		            default:
//		                System.out.println("Invalid month.");
//		                break;
//		        }
//		        System.out.println("Number of Days = "
//		                           + numDays);