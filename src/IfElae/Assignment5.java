package IfElae;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String args[]) {
        int age1;
        int age2;
        int age3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three ages");
        age1 = sc.nextInt();
        age2 = sc.nextInt();
        age3 = sc.nextInt();

        if (age1 < age2 && age1 < age3) {
            System.out.println("The youngest age is age1" +  age1);
        } else if (age2 < age3) {
            System.out.println("The youngest age is age2" + age2);
        } else {
            System.out.println("The youngest age is age3" + age3);
        }
        if (age1>age2 && age1>age3)
        {
            System.out.println("Oldest is age1="+age1);
        }
        else if (age2>age3)
        {
            System.out.println("The Oldest age is age2="+age2);
        }
        else
        {
            System.out.println("Oldest age is age3="+age3);
        }
    }

    }
