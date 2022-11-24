package StarPattern;

public class StarPattern3 {
    public static void main(String[] args) {


        for(int row=1;row<=5; row++)
        {
            for(int coloumn=1;coloumn<=row;coloumn++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
