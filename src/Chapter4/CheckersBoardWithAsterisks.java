package Chapter4;

public class CheckersBoardWithAsterisks {
    public static void main(String[] args) {
        int space;

        for (int row = 1; row <= 2; row++) {
            for (int asteriks = 1; asteriks <= 8; asteriks++) {
                System.out.print("A ");
            }
            System.out.println();
            System.out.println();
            for (space = 1; space <= 1; space++) {
                System.out.print(" ");
            }
            for (int asterisks2 = 1; asterisks2 <= 8; asterisks2++) {
                System.out.print("B ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
