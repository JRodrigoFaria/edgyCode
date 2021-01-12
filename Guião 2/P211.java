import java.util.Scanner;

public class P211
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the solutions to your Ax² + Bx + C = 0 equations");
		System.out.print("Insert the value of A: ");
		double a = sc.nextDouble();
		System.out.print("Insert the value of B: ");
		double b = sc.nextDouble();
		System.out.print("Insert the value of C: ");
		double c = sc.nextDouble();
		if ((Math.pow(b,2) - 4*a*c) < 0)
		{
			String zero1 = (-b / (2*a)) + " + sqrt(" + (Math.abs(Math.pow(b,2) - 4*a*c)) / (2*a) + " * i)";
			String zero2 = (-b / (2*a)) + " - sqrt(" + (Math.abs(Math.pow(b,2) - 4*a*c)) / (2*a) + " * i)";
			if (zero1 == zero2)
				{
					System.out.println("O sistema tem como solução " + zero1);
				}else
				{
					System.out.println("O sistema tem como soluções " + zero1 + " e " + zero2);
				}
		}else
		{
			double zero1 = (-b + Math.sqrt(Math.abs(Math.pow(b,2) - 4*a*c))) / (2*a);
			double zero2 = (-b - Math.sqrt(Math.abs(Math.pow(b,2) - 4*a*c))) / (2*a);
			if (zero1 == zero2)
				{
					System.out.println("O sistema tem como solução " + zero1);
				}else
				{
					System.out.println("O sistema tem como soluções " + zero1 + " e " + zero2);
				}
		}
		
	}
}
