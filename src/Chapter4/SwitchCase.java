package Chapter4;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("please enter a number between 1 and 5: ");
        int purchase = scanner.nextInt();
        switch (purchase){
            case 1:
                System.out.println("buy book");
                break;
            case 2:
                System.out.println("buy bread");
                break;
            case 3:
                System.out.println("buy beans");
                break;
            case 4:
                System.out.println("buy banana");
                break;
            case 5:
                System.out.println("buy bra");
            default:
                System.out.println("invalid purchase number");
        }
        int sumOfGrades = 0;    int counter = 0;
        int gradeACounter = 0;  int gradeBCounter = 0;
        int gradeCCounter = 0;  int gradeDCounter = 0;
        int gradeECounter = 0;  int gradeFCounter = 0;
        System.out.println("enter grade");
        while (scanner.hasNext()){
            int grade = scanner.nextInt();
            sumOfGrades+=grade;
            counter = counter + 1;

//            switch (grade){
//                case
//            }
//        }
//
//        System.out.println(sumOfGrades);
    }
}}
