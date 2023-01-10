package Chapter4;

public class Diamond {
	public static void main(String[] args) {
		int spaces1 = 4;
		int spaces2 = 4;

		for (int row = 1; row <= 5; row++) {
			for (int space1 = 1; space1 <= spaces1; space1++) {
				System.out.print(" ");
			}
			for (int shape = 1; shape <= row; row++){
				System.out.print("* ");
			}
			for (int space2 = 1; space2 <= spaces2; space2++){
				System.out.print(" ");
			}
			System.out.println();
			spaces1--;
			spaces2--;
		}
		spaces1++;	int shapes2 = 4;
		spaces2++;
		for (int rows = 1; rows <= 5; rows++) {
			for (int blanks1 = 1; blanks1 <= spaces1; blanks1++) {
				System.out.print(" ");
			}
			for (int shape2 = 1; shape2 <= shapes2; shape2++){
				System.out.print("* ");
			}
			for (int blanks2 = 1; blanks2 <= spaces2; blanks2++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}