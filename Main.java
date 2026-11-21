import java.util.Scanner;

class functions
{
    int a,b;
    void sum(int a, int b)
    {
        System.out.println("The sum is " + (a + b));
    }

    void diff(int a, int b)
    {
        System.out.println("The diff is " +  (a - b));
    }
}

class calculator extends functions
{
    Scanner obj = new Scanner(System.in);
    
    void calc()
    {
    System.out.print("Enter the value of a: ");
    a = obj.nextInt();
    System.out.print("Enter the value of b: ");
    b = obj.nextInt();

    sum(a, b);
    diff(a, b);
    }

}

public class Main {
    public static void main(String[] args) 
    {
        
        calculator calcu = new calculator();
        calcu.calc();
    }
}

