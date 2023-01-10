package ChapterThree;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            int count = 1;

        System.out.println("Enter 1 to start: ");
                int grade = input.nextInt();

                    while (grade != 10)
                    {
                        System.out.print("enter the grade "+count+": ");
                        grade = input.nextInt();
                        count++;
                    }

                System.out.println(grade >= 60 ? "passed" : "failed");

                if (grade >= 60) {
                    System.out.println("Passed");
                }
                else if (grade >= 40) {
                    System.out.println("passed 40");
                }
                else System.out.println("failed");
                String letter;
                if (grade >= 90){
                    letter = "A";
                }else if(grade >= 80){
                    letter = "B";
                }
                else letter = "F";
                System.out.println(letter);

    }
}
