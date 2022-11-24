package IfElae;

import java.util.Scanner;

//take a value from user and check if it is square or not
public class Assignment1 {
    public static void main(String args[]) {
        int length;
        int breadth;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        length = sc.nextInt();
        System.out.println("Enter the breadth");
        breadth = sc.nextInt();
        if (length == breadth)
        {
            System.out.println("it is a square");
        }
        else
        {
            System.out.println("it is not square");
        }
    }

        }