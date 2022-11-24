package Operators;
//write a program to calculate the sum of the first and the second last digit of 5 digit
//Example -nnumber 12345 outpt=1+4=5
public class Assignment13 {
    public static void main(String args[])
    {
        int number=12345;
        int sum=0;

        int digit=number%10; //5
        number=number/10; //1234

        digit=number%10; //4
        sum=sum+digit;

        digit=number%10; //4
        number=number/10; //123

        digit=number%10; //3
        number=number/10; //12

        digit=number%10; //2
        number=number/10; //1

        digit=number%10; //1
        number=number/10; //0

        sum=sum+digit;
        System.out.println("sum of the first and second last digit is "+sum);

    }
}
