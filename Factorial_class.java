import java.util.Scanner;

class factorial
{
      Scanner obj = new Scanner(System.in);
int n;
    void input()
    {
        System.out.println("Enter the number: ");
        n = obj.nextInt();
    }


    void factorialcalc()
    {
        
        int fact = 1;
        for (int i = 1; i <=n; i++) 
        {
            fact = i * fact;
        }
        System.out.println("Factorial is " + fact);
        //return fact;
    }
}

public class Factorial_class {
    public static void main(String[] args) {

        //int n; //answer;
        
        // System.out.println("Enter the number: ");
        // n = obj.nextInt();

        factorial result = new factorial();
        result.input();

        result.factorialcalc();


        //System.out.println("The answer is: " + answer);
        
    }
}