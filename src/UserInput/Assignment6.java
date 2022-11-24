package UserInput;

import java.util.Scanner;

//write a program to find the square of 2 and 4
public class Assignment6 {
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sc =new Scanner(System.in);
        double num;
        num=sc.nextDouble();
        double square =num*num;
        System.out.println("Square of number is"+square);

    }

}
