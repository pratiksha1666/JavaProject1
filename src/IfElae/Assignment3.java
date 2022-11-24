package IfElae;

import java.util.Scanner;

//A shop will give discount of 10% if the cost of purchesed quality is more than 1000 ask user for quality supoose one
//unit will cost judge and print total cost for user
public class Assignment3 {
    public static void main(String args[])
    {
        int Quality;
        Scanner sc=new Scanner(System.in);
        Quality=sc.nextInt();
                if (Quality*100>100)
                {
                    System.out.println((Quality*100)-((Quality/100)*100));
                    System.out.println("Cost is");
                }
                else
                {
                    System.out.println("cost is"+Quality*100);
                }
    }
}
