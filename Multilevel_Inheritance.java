// Handles basic math
class BasicCalculator 
{
    void add(int a, int b) 
    {
        System.out.println("Addition Result: " + (a + b));
    }
    
    void subtract(int a, int b) 
    {
        System.out.println("Subtraction Result: " + (a - b));
    }
}

// Inherits basic math and adds scientific functions
class ScientificCalculator extends BasicCalculator 
{
    void power(int base, int exponent) 
    {
        System.out.println("Power Result: " + Math.pow(base, exponent));
    }
    
    void squareRoot(int number) 
    {
        System.out.println("Square Root Result: " + Math.sqrt(number));
    }
}

// Inherits everything above and adds system features
class SmartCalculator extends ScientificCalculator
{
    void answer() 
    {
        System.out.println("Answer given successfully.");
    }
}

// Main Class to execute the program
public class Multilevel_Inheritance 
{
    public static void main(String[] args) 
    {
        // Instantiate the lowermost class in the chain
        SmartCalculator myCalc = new SmartCalculator();

        System.out.println("--- Testing Multilevel Inheritance Calculator ---");
        
        // 1. Accessing methods from Grandparent (BasicCalculator)
        myCalc.add(15, 4);
        myCalc.subtract(50, 12);
        
        // 2. Accessing methods from Parent (ScientificCalculator)
        myCalc.power(2, 3);
        myCalc.squareRoot(16);
        
        // 3. Accessing methods from Child (SmartCalculator)
        myCalc.answer();
    }
}
