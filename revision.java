import java.util.Scanner;

class calculator
{
    int a,b, sum, diff;
    int sum()
    {
        sum = a + b;
        return sum;
    }
    int diff()
    {
        diff = a - b;
        return diff;
    }
}

class inputs extends calculator
{

    Scanner obj = new Scanner(System.in);
    inputs()
    {
        System.out.print("Enter a: ");
        a = obj.nextInt();
        System.out.print("Enter b: ");
        b = obj.nextInt();
    }

}

class outputs extends inputs
{
    void outputs()
    {
        System.out.print("The sum is " + sum + "\n");
        System.out.print("The diff is " + diff);
    }

}

public class revision {
    public static void main(String[] args) {
        
        outputs func = new outputs();
        func.sum();
        func.diff();
        func.outputs();
        
    }
}