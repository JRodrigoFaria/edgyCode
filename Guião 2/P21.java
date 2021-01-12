import java.util.Scanner;

public class P21
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What was your mark on the TPG1?");
		int val1 = sc.nextInt();
		System.out.print("What was your mark on the TPG2?");
		int	val2 = sc.nextInt();
		System.out.print("What was your mark on the EI?");
		int val3 = sc.nextInt();
		String yn = ((val1*0.2 + val2*0.3 + val3*0.5) >= 9.5) ? "Aproved" : "Not Aproved";
		System.out.println("You are " + yn);
	}	
}
