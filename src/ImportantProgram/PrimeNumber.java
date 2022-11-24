package ImportantProgram;
//Prime number
public class PrimeNumber {
     public static void main(String args[])
     {
         int n=6;

         if (n>0){
             if(n%1==0&&n%3==0) {
                 System.out.println("Prime or Positive");
             }
             else {
                 System.out.println("no is odd");
             }
         }
         else {
             System.out.println("no is Negative");
         }
     }
}

