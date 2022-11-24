package UserInput;

import java.util.Scanner;

//write a program to take two integer inputs from user and print sum and product of them
public class Assignment1 {
    public static void main(String args[])
    {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        a=sc.nextInt();

        System.out.println("Enter b");
        b=sc.nextInt();

        int c1;
        int c2;
        c1=a+b;
        c2=a*b;
        System.out.println("sum="+c1);
        System.out.println("Product="+c2);


    }
}
