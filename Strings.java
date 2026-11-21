import java.util.Scanner;

public class Strings {

    public static void main(String[] args) 
    {

    Scanner obj = new Scanner(System.in);
    String s1[] = new String[3];
    String s2[] = new String[3];
    int size = s1.length;
    String temp = null;

    //Inputting the string
    for (int i = 0; i < 3; i++)
    {
        System.out.println("Enter the name of the city: ");
        s1[i] = obj.nextLine();
    }

    System.out.println("");

    //Lowercasing s1 into s2
   for (int i = 0; i < size; i++) 
   {
       
    s2[i] = s1[i].toLowerCase();
   } 


    //Sorting algorithm
    for (int i = 0; i < size; i++) 
    {
        for (int j = i + 1; j < size; j++) 
        {
            if (s2[j].compareTo(s2[i]) < 0)
            {
                temp = s2[i];
                s2[i] = s2[j];
                s2[j] = temp;
            }     
        }    
    }        
    for (int i = 0; i < size; i++) 
    {
        System.out.println(s2[i]);    
    }
    obj.close();
    }
}
