import java.util.Scanner;

public class P35
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);

    int i;

    int x = sc.nextInt();

    int b = 0;

    

    for (i = 2 ; i <= x ; i=i+2) {

      b = b + i;
	  System.out.println("b:"+b);
    }



    System.out.printf("%d\n", i);

    System.out.printf("%d\n", b);
}
}
