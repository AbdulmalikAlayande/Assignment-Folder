package Chapter4;

import java.util.Scanner;

public class ClassAverage2
{
    private int sum ;

    Scanner scanner = new Scanner(System.in);
    private int counter;

    public void total() {
        int sum = 0;
        int counter = 0;


        System.out.print("enter 1 to start (0 to stop): ");
        int grade = scanner.nextInt();

        if (grade == 1)
        {
            while (grade > 0)
            {
                System.out.print("enter a valid grade between 1 and 100 (0 to stop): ");
                grade = scanner.nextInt();

                if (grade > 0)
                {
                    counter = counter + 1;
                    sum += grade;
                }
                else System.out.println("here are your results");
            }
            System.out.println("The total of all the results is: " + sum);
        }
        else if (grade == 0) {
            System.out.println("you quit");
        }
        else System.out.println("invalid number");
                this.sum = sum;
                this.counter = counter;
    }



    public void average()
    {   if (sum > 0)
        {
            double average = (double) sum / counter;
            System.out.println("The average of all the scores is: "+ average);
        }
        else System.out.println("no valid grades were input");
    }




}





