package ImportantProgram;

import java.util.Scanner;

//Leap Year
public class LeapYear {
    public static void main(String args[])
    {
//        System.out.println("Enter the year");

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the year");
        int year= scanner.nextInt();

        if(year%400==0||(year%100!=0 && year%4==0))
        {
            System.out.println("It is a Leap year");
        }
        else {
            System.out.println("It is not a Leap year");
        }

    }
}
