package Chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

//        private int accountNumber;
//        private int monthBeginningBalance;
//        private int totalItemsCharged;
//        private int totalCredits;
//        private int creditLimit;
//
  //      public void newBalance() {

        System.out.print("please enter your accountNumber: ");
        int accountNumber = scanner.nextInt();

        System.out.print("please enter your balance at the beginning of the month: ");
        int balance = scanner.nextInt();

        System.out.print("enter the total items bought for this month: ");
        int itemsCharged = scanner.nextInt();

        System.out.print("enter the total credits applied to your account this month: ");
        int credits = scanner.nextInt();

        System.out.print("please enter your credit limit: ");
        int limit = scanner.nextInt();

        int newBalance = balance + itemsCharged - credits;

        System.out.println("your new Balance is " + newBalance);
        System.out.println();

                        while (scanner.hasNext())
                        {
                            System.out.print("please enter your accountNumber: ");
                            accountNumber = scanner.nextInt();

                            System.out.print("please enter your balance at the beginning of the month: ");
                            balance = scanner.nextInt();

                            System.out.print("enter the total items bought for this month: ");
                            itemsCharged = scanner.nextInt();

                            System.out.print("enter the total credits applied to your account this month: ");
                            credits = scanner.nextInt();

                            System.out.print("please enter your credit limit: ");
                            limit = scanner.nextInt();

                            System.out.println("your new Balance is " + newBalance);
                            System.out.println();

         //   }
        }
    }
}