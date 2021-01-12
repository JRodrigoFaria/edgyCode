import java.util.Scanner;

public class P44
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int secret = (int)(100*Math.random()) + 1;
		System.out.printf("Guess the number from 1 to 100: ");
		int count = 1;
		do
		{
			System.out.printf("New entry: ");
			int attempt = sc.nextInt;
			if (attempt<secret) System.out.println("Up");
			if (attempt>secret) System.out.println("Down");
			count++;
		}while (attempt != secret);
		System.out.printf("Congrats, you got it! (after %d attempts)", count);
	}
}

