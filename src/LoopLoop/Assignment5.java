package LoopLoop;

import java.util.Scanner;

//factorial
public class Assignment5 {
    public static void main(String[] args) {
        // Scanner scanner=new Scanner(System.in);
        //System.out.println("enter the no");
        //int n=scanner.nextInt();
       /* int factorial=1;
        if(n==0) {
            factorial = 0;
        }
        for(int i=1;i<=n;i++) {
            factorial *= 1;
        }
        System.out.println("factorial of number"+n +" is "+factorial);
        }

    }
    */
        int n = 10;
        int factorial = 1;

        for (int i = n; i <= 10; i--) {
            factorial = factorial * i;
        }
        System.out.println("factorial=" + factorial);
    }
}