package Chapter4;

import java.util.Scanner;

public class EmployeesSalaryCalculator
{
    Scanner scanner = new Scanner(System.in);
    private double grossPay;
    private double timeAndHalfPay;

    public void grossPay()
            {
                int counter = 1;
                double grossPay = 0;
                double timeAndHalfPay = 0;
                System.out.println("enter 1 to start (0 to stop): ");
                int hoursWorked = scanner.nextInt();

                while (hoursWorked > 0)
                {
                    System.out.println("enter the number of hours worked(0 to quit): ");
                    hoursWorked = scanner.nextInt();
                    if (hoursWorked > 0) {
                        System.out.println("enter your hourly pay rate(0 to quit): ");
                        double hourlyPayRate = scanner.nextDouble();

                        counter = counter + 1;

                        grossPay = hoursWorked * hourlyPayRate;
                        timeAndHalfPay = hourlyPayRate * 1.5;

                    }
                    else System.out.println("you are done: ");
                }
                this.grossPay = grossPay;
                this.timeAndHalfPay = timeAndHalfPay;    scanner.nextLine();


        }

        public double getGrossPay()
        {
            return grossPay;
        }

    public double getTimeAndHalfPay() {
        return timeAndHalfPay;
    }
}
