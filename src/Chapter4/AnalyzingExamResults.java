package Chapter4;

import java.util.Scanner;

public class AnalyzingExamResults {


    Scanner scanner = new Scanner(System.in);

    public void grades()
    {

        int numberOfPasses = 0;
        int numberOfFailures = 0;

        System.out.println("enter 1 to start (0 to quit): ");
        int grade = scanner.nextInt();

        if ( grade == 1) {

            while (grade > 0) {
                System.out.println("enter student grade between (1 & 2) for the name you entered: ");
                grade = scanner.nextInt();

                if (grade == 1) {
                    numberOfPasses = numberOfPasses + 1;
                } else if (grade == 2) {
                    numberOfFailures = numberOfFailures + 1;
                } else System.out.println("invalid grade");

            }
            System.out.println(numberOfPasses + " people passed");
            System.out.println(numberOfFailures + " people failed");

        }
        else System.out.println("invalid number");

        if (numberOfPasses > 8) {
            System.out.println("bonus to instructor");
        }
    }

}