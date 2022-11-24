package IfElae;

import java.util.Scanner;

//4-digit number is entered through keyboard. write a program print number with digit revers of original one
public class Assignment11 {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();

        int digit=num%10;
        num=num/10;

        int digit1=num%10;
        num=num/10;

        int digit2=num%10;
        num=num/10;

        int digit3=num%10;
        num=num/10;

        System.out.println(digit);
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);

    }
}
