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

       for(int i=0;i<6;i++) {
         for(int j=0;j<6-i;j++)  {
             System.out.println("  ");
         }

        for(int k=0;k<=i;k++) {
            System.out.println("  *");
        }
           System.out.println();
       }





        }
  }
