package UserInput;

import java.util.Scanner;

//enter the val of two variable a and b and then check the conditions are equale
public class Assignment9 {
    public static void main(String args[])
    {
        int a ;
        int b;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the val of a");
        a=scanner.nextInt();
        System.out.println("Enter the val of b");
        b=scanner.nextInt();
        if(a<50&&a<b)
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
