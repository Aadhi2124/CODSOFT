import java.util.*;
public class GradeCalculator 
{
    double avg;
    public GradeCalculator(double average)
    {
        this.avg = average;
    }
    public void grade()
    {
        if((avg > 90) && (avg<=100))
        {
            System.out.println("O Grade");
        }
        else if((avg > 80) && (avg<=90))
        {
            System.out.println("A+ Grade");
        }
        else if((avg > 70) && (avg<=80))
        {
            System.out.println("A Grade");
        }
        else if((avg > 60) && (avg<=70))
        {
            System.out.println("B+ Grade");
        }
        else if((avg > 50) && (avg<=60))
        {
            System.out.println("B Grade");
        }
        else
        {
            System.out.println("Fail");
        }
    }
    public static void main(String[] args) {
        int i,total = 0;
        double average;
        Scanner in = new Scanner(System.in);
        int[] marks = new int[10];
        System.out.println(".......Student Grade Calculator.......");
        for(i=1;i<=5;i++)
        {
            System.out.println("Enter the mark for Subject "+i+":");
            marks[i] = in.nextInt();
        }
        for(i=1;i<=5;i++)
        {
            total += marks[i];
        }
        average = total/5;
        GradeCalculator calc = new GradeCalculator(average);
        System.out.println("Total Marks obtained "+total);
        System.out.println("Average "+average);
        calc.grade();
        in.close();
    }
}