import java.util.Scanner;

public class P54
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a number from 1 to 99: ");
        int n = sc.nextInt();
        table(n);
    }
    
    public static boolean getIntRange(int n)
    {
        return ((n>0) && (n<=100));
    }
    
    public static void table(int n)
    {
        if (getIntRange(n)) for (int i=1; i<10; i++) System.out.printf("%d x %d = %d\n", n, i, (n*i));
    }
}
