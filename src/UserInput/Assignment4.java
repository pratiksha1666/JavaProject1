package UserInput;

import java.util.Scanner;

//take name ,roll number and field of intrest from user and print the format below
//hey,my name is xyz and my rill number is xyz.my field of intrest are xyz
public class Assignment4 {
    public static void main(String args[])
    {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();

        String area;
        System.out.println("Enter yr area of interest");
        area=sc.nextLine();

        int roll;
        System.out.println("Enter roll no");
        roll=sc.nextInt();

        System.out.println("Hey,");
        System.out.println("My name is "+name+"and my roll no is"+roll+".my field od interest are="+area);
    }
}
