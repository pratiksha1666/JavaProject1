package UserInput;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String args[])
    {
        String str1;
        String str2;
        System.out.println("Enter the first string");
        Scanner scanner=new Scanner(System.in);
        str1=scanner.nextLine();
        System.out.println("Enter the second string");
        str2=scanner.nextLine();
        String add=str1+str2;
        System.out.println("Enter string is :\n"+add);


    }
}
