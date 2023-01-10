package Chapter4;

import java.util.Scanner;

public class ClassAverage1 {
    private double sum;
    private  int counter;
    Scanner input = new Scanner(System.in);

    public void sum()
    {

        double sum = 0;     int counter = 0;

        double grade;

        while (counter < 10)
        {
            System.out.print("enter student grade: ");
            grade = input.nextDouble();
            if (grade > 0 && grade < 100)
            {
                sum = sum + grade;
                counter++;
            }
            else {
                System.out.println("please enter a valid grade");
            }
        }
        System.out.println();
        System.out.println("the total of all the grade is: "+sum);
        this.sum = sum;
        this.counter = counter;
    }

    public double getGradeAverage() {
        double gradeAverage;
        gradeAverage = sum/counter;
        return gradeAverage;
    }
}
