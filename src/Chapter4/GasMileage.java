package Chapter4;

import java.util.Scanner;

public class GasMileage {

    private double milesPerGallon;

            Scanner scanner = new Scanner(System.in);
        public void checkMileage() {
            double milesPerGallon = 0;

                System.out.print("enter 1 to start and enter 0 to quit: ");
                double distance = scanner.nextDouble();


                if (distance >= 1) {
                    int counter = 0;
                    while (distance > 0) {
                        System.out.print("enter the number of miles driven (0 or any number less to quit): ");
                        distance = scanner.nextDouble();

                        if (distance > 0) {
                            System.out.print("enter the number of gallons used(0 or any number less to quit): ");
                            double gallons = scanner.nextDouble();

                            counter++;
                            milesPerGallon = distance / gallons;
                            System.out.println("the miles moved per gallon used is: " + milesPerGallon + "Mpg");
                            System.out.println();
                        } else System.out.println("you are done");
                        milesPerGallon = milesPerGallon+1;
                    }
                    counter = counter + 1;


                } else System.out.println("seems like you dont wish to check any mileage on your car");
                this.milesPerGallon= milesPerGallon;
        }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }
    public double combinedMilesPerGallon(){
           double combinedMilesPerGallon = milesPerGallon;
           return combinedMilesPerGallon;
    }


}
