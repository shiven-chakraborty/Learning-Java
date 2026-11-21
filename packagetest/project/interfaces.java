import java.util.Scanner;

interface calculator
{
    void add();
    void sub();
}

class inputs
{
    int a,b;
    Scanner obj = new Scanner(System.in);
    
    void getinputs()
    {
    System.out.print("Enter a: ");
    a = obj.nextInt();
    System.out.print("Enter b: ");
    b = obj.nextInt();
    }
}

class functions extends inputs implements calculator
{
    int sum, diff;
    public void add()
    {
        sum = a + b;
    }
    public void sub()
    {
        diff = a - b;
    }
}

public class outputs extends functions
{
    void giveoutputs()
    {
    System.out.println("The sum is " + sum);
    System.out.println("The diff is " + diff);
    }
}

public static void main(String args[])
{

}

