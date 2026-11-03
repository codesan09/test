// old style java hello print
public class hello {
    public static void main(String[] args)
    {
        System.out.println("hello java");

        functions calc = new functions();
        System.out.println(calc.add(30,67));

        for(int i = 1; i<10; i++)
        {
            System.out.println(i);
        }

        hel(args);
    }

    // why got ignored
    public static void hel(String[] args)
    {
        System.out.println("hello in hell");
    }
    
}

class functions{
    int add(int a, int b)
    {
        return a+b;
    }
    int multiply(int a, int b)
    {
        return a*b;
    }
}