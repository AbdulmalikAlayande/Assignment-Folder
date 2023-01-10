package Chapter4;

public class TrianglePrintingProgram {
	public static void main(String[] args) {
		int space1 = 4; int space2 = 1;	int space3 = 1;	int space4 = 4;   int shape2 = 5;
		 int column1 = 1;
		for (int row = 1; row <= 5; row++) {
			for (int triangle1 = 1; triangle1 <= column1; triangle1++) {
				System.out.print("*");
			}
			column1++;
			for (int space = 1; space <= space1; space++) {
				System.out.print(" ");
			}
			System.out.print("\t\t");
			for (int triangle2 = 1; triangle2 <= shape2; triangle2++) {
				System.out.print("*");
			}
			System.out.println("\t\t");

		}
	}
}
