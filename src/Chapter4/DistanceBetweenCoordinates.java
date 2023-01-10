package Chapter4;

import java.util.Scanner;

public class DistanceBetweenCoordinates {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double positiveX = 0;
		double negativeX = 0;
		double positiveY = 0;
		double negativeY = 0;
		double point0 = 0;

		System.out.print("Enter The X-AXIS value: ");

		while (scanner.hasNext()) {

			double x_value = scanner.nextDouble();

			System.out.print("Enter The Y-AXIS value: ");
			double y_value = scanner.nextDouble();

			if (x_value > 0 && y_value > 0)
			{
				System.out.println("The point is at an angle to the positive x-axis and positive y-axis");
			}
			else if (x_value < 0 && y_value < 0)
			{
				System.out.println("The point is at an angle to the negative x-axis and negative y-axis");
			}
			else if (x_value < 0 && y_value > 0)
			{
				System.out.println("The point is at an angle to the nagative x-axis and positive y-axis");
			}
			else if (x_value > 0 && y_value < 0)
			{
				System.out.println("The point is at an angle to the positive x-axis and negative y-axis");
			}
			else if ((x_value == 0) && (y_value > 0 || y_value < 0))
			{
				System.out.println("The point is perpendicular to both the positive x-axis and negative x-axis");
			}
			else if ((y_value == 0) && (x_value > 0 || x_value < 0))
			{
				System.out.println("The point is perpendicular to both the positive y-axis and negative y-axis");
			}
			else System.out.println("The point is at at 0 degrees to all axis");
		}
	}
}
