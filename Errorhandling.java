
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

        int arr[] = {1, 2, 3};
        try 
        {
            int d = a / (b - c);

            System.out.println(d);
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Division by zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Array index out of bounds");
        }

        System.out.println("Program run successfully");
        obj.close();
    }
}
