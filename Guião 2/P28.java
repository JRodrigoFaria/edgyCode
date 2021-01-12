import java.util.Scanner;

public class P28
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
		if((a >= b) && (a >= c))
		{
			if(b >= c)
			{
				System.out.printf("%d < %d < %d", c, b, a);
			}else
			{
				System.out.printf("%d < %d < %d", b, c, a);
			}
		}
		else if((b >= a) && (b >= c))
		{
			if(a >= c)
			{
				System.out.printf("%d < %d < %d", c, a, b);
			}else
			{
				System.out.printf("%d < %d < %d", a, c, b);
			}
		}
		else if((c >= a) && (c >= b))
		{
			if(b >= a)
			{
				System.out.printf("%d < %d < %d", a, b, c);
			}else
			{
				System.out.printf("%d < %d < %d", b, a, c);
			}
		}
	}
}
