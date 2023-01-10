package Chapter4;

import java.util.Scanner;

public class TaxCalculator {

        Scanner scanner = new Scanner(System.in);

        public void calculateTax () {
            int counter = 1;
            double citizensEarnings;
            String name;
            while (counter <= 3) {
                System.out.print("enter citizen " + counter + " name: ");
                name = scanner.nextLine();

                System.out.println("enter " + name + " earnings per year: ");
                citizensEarnings = scanner.nextDouble();
                scanner.nextLine();

                if (citizensEarnings <= 30000) {
                    double citizensTotalTax = 15.0 / 100.0 * citizensEarnings;
                    System.out.println("dear " + name + " your total tax is: " + citizensTotalTax);
                }
                if (citizensEarnings > 30000) {
                    double citizensTotalTax = 20.0 / 100.0 * citizensEarnings;
                    System.out.println("dear " + name + " your total tax is: " + citizensTotalTax);
                }
                System.out.println();
                counter = counter + 1;
            }
        }
}