import java.util.Scanner;

public class P61
{
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Insert the amount of numbers you want to insert: ");
		int n = sc.nextInt();
		int [] table = new int[n];										//Creates an array that supports n int variables
		System.out.print("Insert the numbers: ");
		for (int i=0; i<n; i++) table[i] = sc.nextInt(); 				//Receives the values on the array
		for (int i=(n-1); i>=0; i--) System.out.printf("%d ", table[i]);//Writes them down from last to first
	}
}
