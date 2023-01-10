package Chapter4;

import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range the range of numbers you want to print to its fourth squared: ");
        int range = scanner.nextInt();

        System.out.printf("%s%10s%10s%10s%n", "N1","N2","N3","N4");

        int numee =1;   int num = 1;
        for (int row = 1; row <= range; row++) {

            for (int one = numee; one <= num; one++)
            {
                System.out.printf("%s%10d%10d%10d%n", one, (int)Math.pow(one,2), (int)Math.pow(one,3),(int)Math.pow(one,4));
            }
            numee++;
            num++;

//            for (int two = 2; two <= 2; two++)
//            {
////                int power = 1;
//                System.out.printf("%s%10d%10d%10d%n", two, (int)Math.pow(two,2), (int)Math.pow(two,3),(int)Math.pow(two,4));
//            }
//            for (int three = 3; three <= 3; three++)
//            {
////                int power = 1;
//                System.out.printf("%s%10d%10d%10d%n", three, (int)Math.pow(three,2), (int)Math.pow(three,3),(int)Math.pow(three,4));
//            }
//            for (int four = 4; four <= 4; four++)
//            {
////                int power = 1;
//                System.out.printf("%s%10d%10d%10d%n", four, (int)Math.pow(four,2), (int)Math.pow(four,3),(int)Math.pow(four,4));
//            }
//            for (int five = 5; five <= 5; five++)
//            {
//           //     int power = 1;
//                System.out.printf("%s%10d%10d%10d%n", five, (int)Math.pow(five,2), (int)Math.pow(five,3),(int)Math.pow(five,4));
//            }
//
//


        }

            }

        }
















//    int multiplier = 1;
//   //        System.out.printf("%s%3s%3s%3s%n","N N^2 N^3 N^4");
//           for (int outer = 1; outer <= 4; outer++) {
//               for (int number  = 1; number  <= 5; number ++) {
//                   System.out.println(number+"\t");
//               }
//               for (int numberSquared = 1; numberSquared == numberSquared; numberSquared++) {
//                   multiplier *= numberSquared;
//                   numberSquared++;
//               }
//               System.out.println(multiplier);
//           }











//        }
//    }
//}
//
//            for (int power = 1; power <= 5; power++) {
//                        for (int number = 1; number <= power; number++) {
//                            System.out.print(number+"       ");
//                            number= (int) Math.pow(number,number);
//System.out.println();
//for (int numb = 2; numb == column; numb++) {
//                         multiplier = numb;
//                    System.out.print(multiplier + "\t");
//                         multiplier = multiplier * numb;
//                   numb++;
//                int multiplier = 1;
//                        for (int row = 1; row <= 4; row++) {
//                            for (int column = row; column <= row; column++) {
//                                System.out.print(row+"\t");
//                               }