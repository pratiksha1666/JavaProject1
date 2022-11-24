package UserInput;

import java.util.Scanner;
//take side of square from user and print the ares and squre of
public class Assignment5 {
    public static void main(String args[])
    {
        System.out.println("Enter the side of square");
        Scanner sc=new Scanner(System.in);

     double square;
     square=sc.nextDouble();
     double area =square*square;
     System.out.println("area of square is="+area);
     double perimeter=4*square;
     System.out.println("Perimeter ="+perimeter);


    }
}
