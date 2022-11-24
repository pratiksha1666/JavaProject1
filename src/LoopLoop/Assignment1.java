package LoopLoop;

import java.util.Scanner;

//take 10 integer value from user and print there average on the screen
public class Assignment1 {
    public static void main(String args[])
    {
        int i;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        i=scanner.nextInt();

        int sum=0;
        float avg=0;
        int counter=0;
        for (i=0;i<10;i++)
        {
            System.out.println("sum of the number is"+sum);
            sum=sum+i;
            counter++;
            System.out.println("avg of the number is " + avg);
            avg=(float) sum/counter;
        }

    }
}
