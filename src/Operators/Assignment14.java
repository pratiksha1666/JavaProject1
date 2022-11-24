package Operators;
//w.p to reverse a 3 digit number
//example 123=321
public class Assignment14 {
    public static void main(String args[])
    {
        int num=123;
        int rev=0;
        int rem;

        while (num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("the reverse order of number is="+rev);
    }
}
