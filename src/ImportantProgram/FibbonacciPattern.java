package ImportantProgram;

public class FibbonacciPattern {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int sum=1;

      //  for (int row=1;row<5;row++)
            for (int i = 1; i <=5; i++) {

                for (int j = 0; j <=i; j++) {
                    System.out.print(n2 + " ");
                    sum = n1 + n2;
                    n1 = n2;
                    n2 = sum;
                }
                System.out.println();
                }
            }

           /* //for (int colomun=0;colomun<=row;colomun++) {
                System.out.print(n2 + " ");
                sum = n1 + n2;
                n1 = n2;
                n2 = sum;
            }
//            System.out.println();
        }**/
    }




