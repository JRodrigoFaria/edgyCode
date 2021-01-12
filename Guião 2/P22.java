import java.util.Scanner;

public class P22
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("1º Número Real: ");
		double first = sc.nextDouble();
		System.out.print("2º Número Real: ");
		double second = sc.nextDouble();
		if (first > second)
		{
			System.out.println("O número " + first + " é maior");
		}else if (second > first)
		{
			System.out.println("O número " + second + " é maior");
		}else
		{
			System.out.println("Os números que introduziu são iguais");
		}
	}
}
