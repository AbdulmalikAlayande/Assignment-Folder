package chapterTwo;

import java.util.Scanner;

public class GFG {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        //Q1
        int sum = 0;
            for (int num = 1; num <= 99; num+=2)
            {
                sum = num + sum;
        }
            System.out.println("the sum is: "+sum);

        //Q2
        double a = 2.5; int b = 3;
        System.out.println("2.5 raised to power 3 is: "+Math.pow(a,b));

        //Q3
       int i = 1;
             while (i <= 20)
             {
                System.out.print(i+"\t");
                    if (i % 5 == 0)
                   {
                       System.out.println("\n");
                   }
           i++;
       }
        //Q4
       for (int j = 1; j <= 20; j++)
       {
            System.out.print(j+"\t");
                if (j % 5 == 0)
                {
                System.out.println();
            }
        }

       System.out.println();


        int n = 1;
         while (n < 10) {
             System.out.println(n++);
             }
        System.out.println(n);

//        System.out.print("enter any number whether less than 0 greater than 0 or zero: ");
//        int value = scanner.nextInt();
//        int largeNumCounter = 0;    int counter = 1;
//        while (counter <= 10){
//
//        }

        int count = 1;
         while (count <= 20) {
             System.out.println(count % 3 == 1 ? "########" : "++++++++");
             ++count;
             }
//
//        for (int numb = 1; numb <= 4; numb++) {
//            for (int digit = 1; digit <= 4; digit= (int) Math.pow(digit,numb)) {
//                System.out.print(digit+"\t");
//                if (digit == Math.pow(digit,4)){
//                    System.out.println();
//                    digit++;
//                }
//            }
//        }
        int row = 5;

         while (row >= 1) {
            int column = 5;

            while (column >= 1) {
                System.out.print(row % 2 == 0 ? "X" : "O");
                 --column;
            }
            --row;
            System.out.println();
            }


//        System.out.println("enter digit");
//         int x = scanner.nextInt();
//
//        System.out.println("enter second digit");
//        int y = scanner.nextInt();
//        if (x > 5)
//             if (y > 5)
//                 System.out.println("x and y are > 5");
//                else
//                    System.out.println("x is <= 5");

        System.out.println("enter base length of triangle: ");
         int baseLength = scanner.nextInt();

        System.out.println("enter the difference between the base length and height of your triangle: ");
        int difference = scanner.nextInt();

//        note that the base length is the row while the height is the column
        for (int rows = 1; rows < baseLength; rows++) {
            for (int column = 1; column <= rows; column++) {
                System.out.print("*");
            }
            if (rows == baseLength - difference) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}