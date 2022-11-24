package IfElae;

import java.util.Scanner;

//take two val from user and print among them
public class Assignment2 {
    public static void main(String args[])
    {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        a=sc.nextInt();
        System.out.println("Enter b");
        b=sc.nextInt();
        if (a>b)
        {
            System.out.println("Greater no is"+a);
        }
        else if (a<b)
        {
            System.out.println("Greater no is b");
        }
        else
        {
            System.out.println("Both are equal");
        }

    }
}
