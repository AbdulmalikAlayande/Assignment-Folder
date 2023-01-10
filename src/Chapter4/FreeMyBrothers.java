package Chapter4;

import java.util.Scanner;

public class FreeMyBrothers {
        private int accountNumber;
        private int creditLimit;


    Scanner scanner = new Scanner(System.in);
    private int newBalance;


    public FreeMyBrothers(int accountNumber, int creditLimit){

        this.accountNumber = accountNumber;

            if (creditLimit > newBalance)
            {
                this.creditLimit = creditLimit;
            }
            else System.out.println("credit limit exceeded");
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void newBalance()
        {
                int monthBeginningBalance;  int totalItemsBoughtWithinTheMonth;

                int totalCreditWithinMonth; int counter = 0;

                    System.out.println("enter any number to start (0 to stop): ");
                    monthBeginningBalance = scanner.nextInt();

                        while (monthBeginningBalance > 0)
                        {
                            System.out.println("enter your balance at the beginning of the month(0 to stop): ");
                            monthBeginningBalance = scanner.nextInt();

                            System.out.println("enter total items bought within this month(0 to stop): ");
                            totalItemsBoughtWithinTheMonth = scanner.nextInt();

                            System.out.println("enter total credit within this month(0 to stop): ");
                            totalCreditWithinMonth = scanner.nextInt();


                            int newBalance = monthBeginningBalance + totalItemsBoughtWithinTheMonth - totalCreditWithinMonth;
                            counter++;

                                System.out.println(newBalance);
                            counter = counter+1;
                                    this.newBalance = newBalance;
                        }
        }
        public int getNewBalance(){
        return newBalance;
        }

}

