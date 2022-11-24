package Operators;
//module of the quotient is taken with 5 and then multiply the resultant value by 5
public class Assignment5 {
    public static void main(String args[])
    {
        int a=8;
        float b=2345;
        float add=a+b;
        float divide=add/3;
        System.out.println(add);
        System.out.println(divide);
        System.out.println((float)(((8+2345)/3)%5)*5);
    }
}
