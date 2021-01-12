import java.util.Scanner;

public class P23
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza a sua idade: ");
		int age = sc.nextInt();
		if ( age < 6 )
		{
			System.out.println("Isento de pagamento");
		}else if ((age >= 6) && (age <= 12))
		 {
			System.out.println("Bilhete de criança");
		 }else if ((age >= 13) && (age <= 65))
		  {
			System.out.println("Bilhete normal");
		  }else
		   {
			System.out.println("Bilhete de 3ª idade");
		   }
	}
}
