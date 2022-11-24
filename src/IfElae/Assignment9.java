package IfElae;

import java.util.Scanner;

//leap or not
public class Assignment9 {
    public static void main(String[] args) {
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year");
        year=scanner.nextInt();

        if(year%400==0||(year%100!=0)&&(year%4==0))
        {
            System.out.println("leap year");
        }
        else {
            System.out.println("not leap year");
        }

    }
}
