package IfElae;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String args[])
    {
        int classes;
        int attend;
        float attended;
        char medical;

        Scanner sc=new Scanner (System.in);

        System.out.println(" no of classes are held");
        classes=sc.nextInt();
        System.out.println("no of attendence");
        attend=sc.nextInt();
        attended=((attend)/(float)(classes)*100);
        System.out.println("If medical case type y otherwise type n");
        medical=sc.next().charAt(0);

        if(attended>=75) {
            System.out.println("you allow to sit in exam");
        }
        else if(medical=='y')
        {
            System.out.println("you are allow to sit in exam");
        }
        else {
            System.out.println("You are not allow to sit in exam");
        }

    }
}
