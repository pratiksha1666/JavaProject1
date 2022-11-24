package letsProgram;

public class Assignment2 {
    public static void main(String args[]) {
        //without for loop
        /*
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
         */

        //with for loop
        int i;
        int j;
        int row = 3;

        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}


