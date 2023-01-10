package Chapter4;

public class Loop2 {
    public static void main(String[] args) {

        int blanks1 = 6;
        for (int row = 1; row <= 7; row++)
        {
            for (int space1 = 1; space1 <= blanks1; space1++)
            {
                System.out.print(" ");
            }
            for (int character1 = 1; character1 <= row; character1++)
            {
                System.out.print(" +");
            }
            for (int space2 = 1; space2 <= blanks1; space2++)
            {
                System.out.print(" ");
            }
            for (int character2 = 1; character2 <= row; character2++)
            {
                System.out.print("* ");
            }
            System.out.println();
            blanks1--;
        }

        System.out.println();

//        int whiteSpace = 6;
//        for (int rowdy = 1; rowdy <= 7; rowdy++)
//        {
//            for (int column = 1; column <= rowdy; column++)
//            {
//                System.out.print("* ");
//            }
//            for (int space1 = 1; space1 <= whiteSpace; space1++)
//            {
//                System.out.print(" ");
//            }
//            for (int space2 = 1; space2 <= whiteSpace; space2++)
//            {
//                System.out.print(" ");
//            }
//            for (int space3 = 1; space3 < whiteSpace; space3++) {
//                System.out.print(" ");
//            }
//            for (int shape = 0; shape < rowdy; shape++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//            whiteSpace--;

            for (int triangleRow = 1; triangleRow <= 6 ; triangleRow++) {
                for (int shape = 1; shape <= triangleRow; shape++) {
                    System.out.print("*");
                }
                System.out.println();
                for (int space = 2; space <= triangleRow; space++) {
                    System.out.print(" ");
                }
                System.out.println();
            }


        }
    }

