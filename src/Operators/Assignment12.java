package Operators;
//total no.of student in a class are 90 out of which 45 are boys .if 50% of the total student grad 'a' out of which 20
//are boys,then write a program to calculate the total number of girls getting grade 'a'
public class Assignment12 {
    public static void main(String args[])
    {
        int total=90;
        int boys=45;
        int gradeBoys=20;
        int girls=90-boys;
        int gradeStud=(50*total)/100;
        System.out.println("Total girls are");
        System.out.println(girls);
        System.out.println("Total no of students who secured 'A' grade");
        System.out.println(gradeStud);
        System.out.println("Total no of girls who secured 'A' grade");
        System.out.println(gradeStud-gradeBoys);

    }


}
