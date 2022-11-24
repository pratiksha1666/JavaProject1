package UserInput;

import java.util.Scanner;

//two double input for length and breadth of rectangle and print area type casting to int
public class Assignment3 {
    public static void main(String args[])
    {
        double length;
        double breadth;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length=");
        length= sc.nextDouble();
        System.out.println("Enter breadth");
        breadth=sc.nextDouble();
        double area=(length*breadth);
        System.out.println("Area="+area);
    }
}
