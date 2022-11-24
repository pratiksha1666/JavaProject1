package IfElae;

import java.util.Scanner;

//a.below 25-F
//b.25 to 45-E
//c.45 to 50-D
//d.50 to 60-c
//e.60 to 80-B
//f.above 80-A
public class Assignment4 {
    public static void main(String args)
    {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        marks=sc.nextInt();

        if(marks<25)
        {
            System.out.println("Grade=F");
        }
        else if(marks<=45) {
            System.out.println("E");
        }
        else if(marks<=50) {
            System.out.println("D");
        }
        else if (marks<=60)
        {
            System.out.println("C");
        }
        else if(marks <80)
        {
            System.out.println("B");
        }
        else if(marks<100)
        {
            System.out.println("A");
        }
        else {
            System.out.println("visit yor teacher");
        }

    }
}
