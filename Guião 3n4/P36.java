import java.util.Scanner;

public class P36
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a largura do seu retângulo: ");
        int l = sc.nextInt();
        System.out.print("Insira a altura do seu retângulo: ");
        int a = sc.nextInt();
        for (int linhas=0; linhas<a; linhas++)
        {
			for(int cols=0; cols<l; cols++)
			{
				String fill = ((linhas==0)||(linhas==(a-1))||(cols==0)||(cols==(l-1))) ? "*":" ";
				System.out.print(fill);
			}
			System.out.println("");
		}
		
    }
}
