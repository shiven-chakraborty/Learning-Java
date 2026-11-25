
import java.util.Scanner;

public class Errorhandling {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter value a: ");
        int a = obj.nextInt();
        System.out.println("Enter value b: ");
        int b = obj.nextInt();
        System.out.println("Enter value c: ");
        int c = obj.nextInt();
        try 
        {
            int d = a / (b - c);

            System.out.println(d);

        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Division by zero");
        }

        System.out.println("Program run successfully");
        obj.close();
    }
}
