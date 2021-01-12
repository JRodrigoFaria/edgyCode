import java.util.Scanner;

public class P38
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor A: ");
        int a = sc.nextInt();
        System.out.print("Insira o valor de B: ");
        int b = sc.nextInt();
        if (b>a)
        {
			for (int i=a; i<=b; i++)
			{
				if ((i%2)!=0){System.out.println(i);}
			} 
		}else if (a>b)
		 {
			  for (int i=b; i<=a; i++)
			  {
				  if ((i%2)!=0){System.out.println(i);}
			  } 
		 }else
		  {
			   if ((a%2)!=0){System.out.println(a);}
		  }
    }
}
