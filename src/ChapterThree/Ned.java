package ChapterThree;

public class Ned {
    public static void main(String[] args) {


             int x = -2;
             int total = 0;
             while (x <= 10) {
                 int y = x + 2;
                 x++;
                 total += y;
                 System.out.printf("Y is: %d and total is %d\n", y, total);
             }

        System.out.printf("%.0f     %.0f%n",Math.ceil(9.2),Math.floor(9.2));
        System.out.printf("%.0f%n",Math.sin(90));

       int  i = 2, j = 3, k = 2 , m = 2;

        System.out.println(i == 2);
         System.out.println(j == 5);
         System.out.println((i >= 0) && (j <= 3));
         System.out.println((m <= 100) & (k <= m));
         System.out.println((j >= i) || (k != m));
         System.out.println((k + i < j) | (4 - j >= k));
         System.out.println(!(k > j));

//        int c = 9;
//        c = c+c;
//        System.out.println(c);
//        System.out.println(c+++8);
//        System.out.println(c);
//        System.out.println();
//
//
//        int d = 9;
//        System.out.println(++d+8);
//        System.out.println(d);
//
//        int ned = 5;
//        switch (ned){
//            case 1:
//
//                break;
//            case 2:
//                System.out.println("laboji");
//                break;
//            case 3:
//                System.out.println(" it is here");
//                break;
//            case 7:
//                System.out.println("jibola");
//                break;

        }
}


