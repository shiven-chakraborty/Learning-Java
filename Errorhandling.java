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

        int d = a / (b - c);

        System.out.println(d);


        
        obj.close();
    }
}