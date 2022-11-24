package UserInput;

import java.util.Scanner;

//
public class Assignment10 {
    public static void main(String args[])
    {
        int a;
        int b;
        int c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a");
        System.out.println("Enter b");
        System.out.println("Enter c");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
         float add=a+b+c;
         System.out.println("addition="+add);
         float per=(add/300)*100;
         System.out.println("Percentage"+per);



    }
}
