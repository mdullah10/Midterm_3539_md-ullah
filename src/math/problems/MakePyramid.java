package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                *
               * *
              * * *
             * * * *
            * * * * *
           * * * * * *

         */

        //for space
        //for stars
        for (int i= 0; i <15; i++) {
            for (int x= 14; x >=i; x--) {
                System.out.print(" ");
            }
            for (int z = 0; z <= i; z++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
