import java.util.Scanner;

public class P61
{
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Insert the amount of numbers you want to insert: ");
		int n = sc.nextInt();
		int [] table = new int[n];
		System.out.print("Insert the numbers: ");
		for (int i=0; i<n; i++) table[i] = sc.nextInt();
		for (int i=(n-1); i>=0; i--) System.out.printf("%d", table[i]);
	}
}
