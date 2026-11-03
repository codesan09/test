import java.util.*;

public class q2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("enter the value of b: ");
        int b = sc.nextInt();

        System.out.println(grater(a, b));

    }

    public static int grater(int a, int b)
    {
        return (a>b) ? a : b;
    }
}
