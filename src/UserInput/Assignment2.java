package UserInput;

import java.util.Scanner;

//take input as two no.print sum and prod and then print addition of sum and prod
public class Assignment2 {
    public static void main(String ags[])
    {
        int a;
        int b;
        int sum;
        int prod;
        int add;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        System.out.println("============");
        System.out.println("Enter b");
        a=sc.nextInt();

        b=sc.nextInt();
        sum=a+b;
        prod=a*b;
        System.out.println("Sum="+sum);
        System.out.println("Prod="+prod);
        add=sum+prod;
        System.out.println("Addition="+add);
    }

}
