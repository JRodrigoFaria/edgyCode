import java.util.Scanner;

public class P34
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza um número: ");
		int n = sc.nextInt();
		double sum = 0;
		for (int i=0 ; i<n ; i++)
		{
			sum = sum + (Math.pow((-1),i))/(2*i+1);
		}
		System.out.printf("Soma dos %d valores da série de Leibniz:\n%.15f\nValor de PI/4:\n%.15f", n, sum, (Math.PI/4));
	}
}
