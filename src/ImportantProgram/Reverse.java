package ImportantProgram;

public class Reverse {
    public static void main(String args[])
    {
        int n=2849;
        int ans=0;

        while(n>0)
        {
            int rev=n%10;
            ans =ans*10+rev;
        }
        System.out.println(ans);
    }
}
