package Chapter4;

public class MacLaurinSeries {


	public static void main(String[] args) {


		int multiplier = 1;
		int number = 7;
		int numberrr = number;

		while (number > 1)
		{
			multiplier*=number;
			number--;


			int numb = number;   int num = numb;
			int multiple = 1;
			double sumOfTerms = 0;

			int multi = numb;
				while (numb >= 1) {
					multiple *= numb;
					numb--;

				}
					System.out.println(num+" factorial is: "+multiple+"\n");
					System.out.println("The sum of the terms is: "+sumOfTerms);
		}
		System.out.println(numberrr+" factorial is: "+multiplier);

	}
}








//					double e = (double) 1 / multiple;
				//					sumOfTerms += e;

				//					if (num == 3) {
				//						System.out.printf("%s%d%s%.5f%n", "For the ", num, "rd term e is now: ", e);
				//					} else if (num == 2) {
				//						System.out.printf("%s%d%s%.5f%n", "For the ", num, "nd term e is now: ", e);
				//					} else if (num == 1) {
				//						System.out.printf("%s%d%s%.5f%n", "For the ", num, "st term e is now: ", e);
				//					} else {
				//						System.out.printf("%s%d%s%.5f%n", "For the ", num, "th term e is now: ", e);
				//					}