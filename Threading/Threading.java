public class Threading {
    public static void main(String[] args) {
        
        class A extends Thread
        {
            public void run()
            {
                for (int i = 0; i <= 5; i++) 
                {
                    System.out.println("\tFrom Thread A: " + i);
                }
                System.out.println("Exited from Thread A");
            }
        }

        class B extends Thread
        {
            public void run()
            {
                for (int i = 1; i <= 5; i ++)
                {
                    System.out.println("\tFrom Thread B: " + i);
                }
                System.out.println("Exited from Thread B");
            }
        }
        class C extends Thread
        {
            public void run()
            {
                for (int i = 1; i <= 5; i ++)
                {
                    System.out.println("\tFrom Thread C: " + i);
                }
                System.out.println("Exited from Thread C");
            }
        }

        A objA = new A();
        objA.start();

        B objB = new B();
        objB.start();

        C objC = new C();
        objC.start();


    }
}