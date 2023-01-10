package Chapter4;

import java.util.Scanner;

public class ReadingNumbersUntilASpecifiedSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

            System.out.println("enter first number: ");
            int firstNumber = scanner.nextInt();

            int sum = 0;
              int counter = 0;
            System.out.println("enter the numbers you want to add");
            while (counter==1)
            {
                if (sum < firstNumber)
                    {
                        int number = scanner.nextInt();
                        sum += number;

                        
                    }
                    else if (sum == firstNumber)
                    {
                        System.out.println("sum is now equal to firstNumber!!!");

                    }
                    else System.out.println("please stop sum is now more than the first number!!!");
                       counter++;
        }

    }
}
