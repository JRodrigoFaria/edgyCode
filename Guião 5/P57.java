import java.util.Scanner;

public class P57
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert a number: ");
		int a = sc.nextInt();
		System.out.print("Insert a number: ");
		int b = sc.nextInt();
		System.out.printf("The MCD is %d", MCD(a, b));
	}
	
	public static int MCD(int a, int b)
	{
		if (b == 0) return a;
		else return MCD(b, a % b);
	}
}
