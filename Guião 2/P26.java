import java.util.Scanner;

public class P26
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number to find out whether it's odd or even");
		double num = sc.nextDouble();
		String yn = ((num % 2) == 0) ? "The number is even" : "The number is odd";
		System.out.println(yn);
	}
}
