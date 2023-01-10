package Chapter4;

import java.util.Scanner;

public class Loop{
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        for (int outer = 1; outer <= 8; outer++) {
            for (int inner = 1; inner <= outer; inner++)
                System.out.print("$");
            System.out.println();
        }
        System.out.println();


        int sum = 0;
        int counter = 1;
        while (counter <= 1) {
            System.out.print(counter + " enter number ");
            int grade = input.nextInt();

            counter++;
            sum += grade;

            System.out.println(sum);
        }

        System.out.println();

        for (int row = 1; row <= 6; row++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print("4 ");
            }
            System.out.println();
        }


        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("Bomb ");
            }
            System.out.println();
        }
        System.out.println();


        int dog = 1;
        do {
            System.out.print(dog + ", ");
            dog++;
        }
        while (dog >= 10);
        System.out.println();

//another one:
        System.out.print("enter the number of rows(and it must be greater than 1): ");
        int rowNumber = input.nextInt();
        if (rowNumber > 1) {
            for (int outerLoop = 1; outerLoop <= rowNumber; outerLoop++) {
                for (int column = 1; column <= outerLoop; column++) {
                    System.out.print("Abdulmalik ");
                }
                System.out.println();
            }
        } else System.out.println("YOU ARE A FOOL!!! were you not asked to enter a number greater than 1? ");

        System.out.println();

// Mirrored Right-Angled Triangle
        System.out.println("enter the number of rows (the number of rows must be greater than 1)");
        int numberOfRows = input.nextInt();

        int blank = numberOfRows - 1;

        System.out.print("enter any character of your choice: ");
        String character = input.next();

        for (int row = 1; row <= numberOfRows; row++) {
            for (int column = 1; column <= blank; column++) {
                System.out.print(" ");
            }
            for (int shape = 1; shape <= row; shape++) {
                System.out.print(character);
            }
            System.out.println();
            blank--;
        }


//another one:
// try using four(4) FOR LOOPS to display a normal triangle.
        System.out.print("enter the number of rows(it must be greater than 1): ");
        int rows = input.nextInt();

        System.out.print("enter the number of spaces (and it must be 1 lesser than the number of rows): ");
        int space = input.nextInt();
        if (rows > 1) {
            if (space == rows - 1) {
                for (int row = 1; row <= rows; row++) {
                    for (int column = 1; column <= space; column++) {
                        System.out.print(" ");
                    }
                    for (int art = 1; art <= row; art++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                    space--;
                }
            } else
                System.out.println("YOU ARE A FAILURE I SWEAR!!!>> were you not asked to enter a number less than the number of rows by 1?");
        } else
            System.out.println("YOU ARE A FAILURE I SWEAR!!!>> were you not asked to enter a number greater than 1?");

        System.out.println();

//We are printing a double triangle here.
//        int blanks = 4;
//        for (int row = 1; row <= 5; row++) {
//            for (int column = 1; column <= blanks; column++) {
//                System.out.print(" ");
//            }
//            for (int shape = 1; shape <= row; shape++) {
//                System.out.print(" *");
//            }
//            for (int column2 = 1; column2 <= blanks; column2++) {
//                System.out.print(" ");
//            }
//            for (int column3 = 1; column3 <= blanks; column3++) {
//                System.out.print(" ");
//            }
//            for (int shape2 = 1; shape2 <= row; shape2++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//            blanks--;
//
//        }
//        System.out.println();
//



    }
}




