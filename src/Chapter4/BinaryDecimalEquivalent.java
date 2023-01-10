package Chapter4;

import java.util.Scanner;

public class BinaryDecimalEquivalent {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       int counter = 1;
            while (counter == 1)
            {
                System.out.println("enter any amount of digits binary number: ");
                   int digits = scanner.nextInt();

                   int modularNumber = 10;
                   int divisor = 10;

                   int lastdigit = digits % modularNumber/1;
                System.out.println(lastdigit);
                counter++;
                   while (counter == 1)
                   {
                      modularNumber*=modularNumber;
                      divisor*=modularNumber;
                      int nextDigit = digits%modularNumber/divisor;
                       System.out.println(nextDigit);
                   }
                   counter++;
            }

   }
}
