import java.util.Scanner;

public class P33
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza um número: ");
		int m = sc.nextInt();
		int factorial= 1;
		if ((m>0 || m<10))
		{
			for (int i=1 ; i<=m ; i++)
			{
				factorial = i * factorial;
				System.out.printf("%d! = %d\n", i, factorial);
			}
		}else
		{
			System.out.println("Por favor introduza um número entre 0 e 10");
		}
	}
}
