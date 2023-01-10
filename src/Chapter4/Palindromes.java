package Chapter4;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


                int counter = 1;
            while (counter == 1)
            {
                System.out.println("enter five digits palindromes: ");
                int fiveDigits = scanner.nextInt();

                    int dig1 = fiveDigits/10000;
                    int dig2 = fiveDigits % 100 / 10;
                    int dig3 = fiveDigits % 1000 /100;
                    int dig4 = fiveDigits % 100 / 10;
                    int dig5 = fiveDigits % 10;

                    if (fiveDigits > 9999 && fiveDigits < 100000)
                    {

                        if (dig1 == dig5 && dig2 == dig4)
                        {
                            System.out.println(fiveDigits + " is a valid palindrome");
                            counter++;
                        }
                            else System.out.println("INVALID PALINDROME!!!");
                            System.out.println();
                    }
                    else System.out.println("INVALID DIGITS!!!, please enter only five digits\n");
                }
        System.out.println();

    }
}
