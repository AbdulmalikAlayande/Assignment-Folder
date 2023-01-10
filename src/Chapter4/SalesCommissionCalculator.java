package Chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    Scanner scanner = new Scanner(System.in);
          public void calculateEarnings()
          {

                double item1 = 239.99;
                double item2 = 129.75;
                double item3 = 99.95;
                double item4 = 350.89;

                    String salesPersonName;
              System.out.print("dear sales person please enter your name: ");
              salesPersonName = scanner.nextLine();
                while (scanner.hasNext())
                {
                        System.out.print(salesPersonName+" How many item 1 did you sell (input 0 if you didn't sell this item): ");
                        int numberOfItems1Sold = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("How many item 2 did you sell (input 0 if you didn't sell this item): ");
                        int numberOfItems2Sold = scanner.nextInt();

                        System.out.print("How many item 3 did you sell (input 0 if you didn't sell this item): ");
                        int numberOfItems3Sold = scanner.nextInt();

                        System.out.print("How many item 4 did you sell (input 0 if you didn't sell this item): ");
                        int numberOfItems4Sold = scanner.nextInt();

                    double merchandiseWorth = (item1 * numberOfItems1Sold) + (item2 * numberOfItems2Sold) + (item3 * numberOfItems3Sold) +
                            (item4 * numberOfItems4Sold);

                    double salesPersonEarnings = ((9.0 / 100.0) * merchandiseWorth) + 200.00;

                    System.out.println();

                    System.out.println("Dear sales person " + salesPersonName + " your gross earning for this week is: #" + salesPersonEarnings);
                }
                System.out.println();

            }
}
