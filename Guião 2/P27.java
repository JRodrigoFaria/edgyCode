import java.util.Scanner;

public class P27
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert 3 numbers");
		System.out.print("1st: ");
		int a = sc.nextInt();
		System.out.print("2nd: ");
		int b = sc.nextInt();
		System.out.print("3rd: ");
		int c = sc.nextInt();
		System.out.println("The biggest number is:");
		if (((a>=b) && (b>=c)) || ((a>=c) && (c>=b)))
		{
		System.out.println(a);
		}else if (((b>=a) && (a>=c)) || ((b>=c) && (c>=a)))
		{
		System.out.println(b);
		}else if (((c>=a) && (a>=b)) || ((c>=b) && (b>=a)))
		{
		System.out.println(c);
		}
	}
}
