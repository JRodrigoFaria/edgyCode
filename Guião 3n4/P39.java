import java.util.Scanner;

public class P39
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int n= sc.nextInt();
        String pairs= "";
        int sum=0;
        for (int i=1; i<=2*n; i++)
        {
				if (i%2==0)
				{
				pairs= pairs + i + " ";
				sum= sum + i;
				}
		}
		System.out.printf("%s\nSoma de todos os pares: %d", pairs, sum);
    }
}
