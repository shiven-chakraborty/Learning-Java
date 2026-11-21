
class tables
{
    int value, table = 1;

    tables()
    {
        value = 5;
    }

    void table_gen() 
    {
        for (int i = 1; i <= 10; i++) 
        {
            table = i * value;
            System.out.println(value + " x " + i + " = " + table); 
        }
    }
}


public class Tables_class {
    public static void main(String[] args) 
    {
        tables table = new tables();

        
        table.table_gen();
        
    }
}