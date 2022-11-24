package LoopLoop;
//print the following pattern
//*
//**
//***
//****
public class Assignment2 {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++)
        {
            for (int colomn=1;colomn<=row;colomn++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
