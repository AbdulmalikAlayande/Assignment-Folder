package Chapter4;

import java.util.Scanner;

public class StudentGradesMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            int passed = 1;
            int failed = 2;
            int counter = 1;
            int numberOfPasses = 0;

        String name;

                while (counter <= 10) {
                    System.out.println("Enter your name: ");
                    name = scanner.nextLine();

                    System.out.println("Enter your grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine();

                        if (grade >= 50) {
                            numberOfPasses++;
                            System.out.println(name+"you passed and your grade is: " + passed);
                        }


                        if (grade < 50) {
                            System.out.println("you failed and your grade is: " + failed);
                        }
                        counter++;

                }


        System.out.println();
        if (numberOfPasses > 8) {
            System.out.println(numberOfPasses + "people passed\n bonus to instructor ");
        }





    }
}








































//        System.out.println("enter grade");
//        int studentGrade = scanner.nextInt();
//        int sum = 0;
//        while (studentGrade != 0) {
//            sum += studentGrade;
//            sum++;
//            System.out.print("enter grade (0 to stop)");
//            studentGrade = scanner.nextInt();
//        }
//        System.out.println("the sum is: " + sum);
//
//
//           int num = 1;
//        while (num < 10){
//            System.out.print(num);
//            System.out.print(", ");
//            num++;
//        }
//        System.out.println(num);
//        System.out.println("enter your grade (enter any number less than 0 to quit: ");
//        int grade = scanner.nextInt();
//        int total = 0; int gradeCounter = 0;
//        while (grade > 0){
//            total = total + grade; // add grade to total
//        gradeCounter= gradeCounter + 1;
//        System.out.print("Enter grade (enter any number less than 0 to quit: ");
//        grade = scanner.nextInt();
//            System.out.println(total);
//        }
//        if (gradeCounter > 0) {
//            double average = (double) total / gradeCounter;
//            System.out.println(average);
//        }
//        else System.out.println("invalid input, no inputs were taken");
//
//        int y= 2; int x = 2;
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//
//
//       int add = 0;
//        for (int counter = 2; counter <= 40;  counter+=2) {
//            add += counter;
//        }
//        System.out.println(add);
//    }
//
//}
