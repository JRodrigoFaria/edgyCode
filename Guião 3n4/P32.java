import java.util.Scanner;

public class P32
{
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o número que quer: ");
		int n = sc.nextInt();
		System.out.println("Tabuada do "+n);
		for (int i=1 ; i<=10; i++)
		{
			System.out.printf("%d x %d = %d\n", n, i, n*i); 
		}
	}
}
