package IfElae;

import java.util.Scanner;

//
public class Assignment10 {
    public static void main(String[] args) {
        int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age");
        age=scanner.nextInt();
        char sex;
        System.out.println("Enter sex");
        sex=scanner.next().charAt(0);
        char marital_status;
        System.out.println("Enter your marital status'Y','N' ");
        marital_status=scanner.next().charAt(0);
        if(sex=='F') {
            System.out.println("Employee sex is female you will work only in urban areas");
        }
        else if(sex=='M'&&(age>20 && age<40)) {
            System.out.println("Employee sex is male you will work on anywhere");
        }
        else if(sex=='M' && (age>40 && age<60))
        {
            System.out.println("Employee sex is male you will work on urban areas only");
        }
        else {
            System.out.println("Error");
        }
    }
}
