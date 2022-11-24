package IfElae;

import java.util.Scanner;

//write a program to print the absolute value of a number
public class Assignment6 {
    public static void main(String args[])
    {
        int num;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number");
        num=scanner.nextInt();
        if(num<0)
        {
            System.out.println(num*-1);
        }
        else {
            System.out.println(num);
        }
    }
}
