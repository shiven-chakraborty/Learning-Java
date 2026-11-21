package project;
import java.util.Scanner;

public class trial
{
    int a, b, sum, diff;
    public void inputs()
    {
        Scanner obj = new Scanner (System.in);

        System.out.println("Enter a: ");
        a = obj.nextInt();
        System.out.println("Enter b: ");
        b = obj.nextInt();
    }

    public void calc()
    {
        sum = a + b;
        diff = a - b;
    }

    public void outputs()
    {
        System.out.println("The sum is " + sum);
        System.out.println("The diff is " + diff);
    }


}