package letsProgram;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String args[])
    {
        int a;
        int b;
        int diff;
        int prod;

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a");
        a=scanner.nextInt();
        System.out.println("enter b");
        b=scanner.nextInt();

        diff=a-b;
        prod=a*b;

        System.out.println("Difference="+diff);
        System.out.println("Product="+prod);

    }
}
